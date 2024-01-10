class Solution {
    private int[] rowUsed = new int[9];
    private int[] colUsed = new int[9];
    private int[][] blockUsed = new int[3][3];
    private List<int[]> emptySpaces = new ArrayList<int[]>();
    private boolean isValidSolution = false;

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] != '.') {
                    int digit = board[i][j] - '0' - 1;
                    markUsed(i, j, digit);
                }
            }
        }

        while (true) {
            boolean modified = false;
            for (int i = 0; i < 9; ++i) {
                for (int j = 0; j < 9; ++j) {
                    if (board[i][j] == '.') {
                        int mask = ~(rowUsed[i] | colUsed[j] | blockUsed[i / 3][j / 3]) & 0x1ff;
                        if ((mask & (mask - 1)) == 0) {
                            int digit = Integer.bitCount(mask - 1);
                            markUsed(i, j, digit);
                            board[i][j] = (char) (digit + '0' + 1);
                            modified = true;
                        }
                    }
                }
            }
            
            if (!modified) {
                break;
            }
        }

        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.') {
                    emptySpaces.add(new int[]{i, j});
                }
            }
        }

        backtrackSudoku(board, 0);
    }

    public void backtrackSudoku(char[][] board, int pos) {
        if (pos == emptySpaces.size()) {
            isValidSolution = true;
            return;
        }

        int[] space = emptySpaces.get(pos);
        int i = space[0], j = space[1];
        int mask = ~(rowUsed[i] | colUsed[j] | blockUsed[i / 3][j / 3]) & 0x1ff;
        for (; mask != 0 && !isValidSolution; mask &= (mask - 1)) {
            int digitMask = mask & (-mask);
            int digit = Integer.bitCount(digitMask - 1);
            markUsed(i, j, digit);
            board[i][j] = (char) (digit + '0' + 1);
            backtrackSudoku(board, pos + 1);
            markUsed(i, j, digit);
        }
    }

    public void markUsed(int i, int j, int digit) {
        rowUsed[i] ^= (1 << digit);
        colUsed[j] ^= (1 << digit);
        blockUsed[i / 3][j / 3] ^= (1 << digit);
    }
}