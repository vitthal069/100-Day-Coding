class Solution {
    public int finalValueAfterOperations(String[] operations) {
         int X = 0;

        for (String op : operations) {
            if (op.equals("++X") || op.equals("X++")) {
                X++;
            } else if (op.equals("--X") || op.equals("X--")) {
                X--;
            }
        }

        return X;
    }
}