class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];
        for(int r=0; r<result.length; r++){
            for(int c=0; c<result[0].length; c++){
                result[r][c] = convolution(img,r,c);
            }
        }
        return result;
    }
    public int convolution(int[][] img, int row, int col){
        int sum = img[row][col];
        int count = 1;
        if(row-1>=0) {count++;sum += img[row-1][col];}
        if(row-1>=0 && col-1>=0) {count++;sum += img[row-1][col-1];}
        if(row-1>=0 && col+1<img[0].length) {count++;sum += img[row-1][col+1];}
        if(col-1>=0) {count++;sum += img[row][col-1];}
        if(col+1<img[0].length){count++;sum += img[row][col+1];}
        if(row+1<img.length && col+1<img[0].length) {count++;sum += img[row+1][col+1];}
        if(row+1<img.length && col-1>=0) {count++;sum += img[row+1][col-1];}
        if(row+1<img.length) {count++;sum += img[row+1][col];}
        return sum/count;
    }
}