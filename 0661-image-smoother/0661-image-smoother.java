class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] res = new int[img.length][img[0].length];
        for(int i = 0; i < img.length; i++){
            for(int j = 0; j < img[0].length; j++){
                double sum = 0;
                int cells = 0;
                if(j > 0) {
                    sum += img[i][j-1];
                    cells++;
                    if(i > 0){
                        sum += img[i-1][j-1];
                        cells++;
                    }
                    if(i < img.length -1) {
                        sum += img[i+1][j-1];
                        cells++;
                    }
                }
                if(i < img.length - 1) {
                    sum+= img[i+1][j];
                    cells++;
                }
                if(i > 0){
                    sum += img[i-1][j];
                    cells++;
                }
                if(j < img[0].length - 1) {
                    sum += img[i][j+1];
                    cells++;
                    if(i > 0) {
                        sum += img[i-1][j+1];
                        cells++;
                    }
                    if(i < img.length - 1) {
                        sum += img[i+1][j+1];
                        cells++;
                    }
                }
                sum += img[i][j];
                cells++;
                sum = Math.floor(sum / cells);
                res[i][j] = (int) sum;
            }
        }
        return res;
    }
}