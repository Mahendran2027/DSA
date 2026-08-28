class Solution {
    public int[][] transpose(int[][] matrix) {
       // int[][] mi=new int[m][n];
         int m=matrix.length;
         int n=matrix[0].length;
         int[][] mi=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mi[j][i]=matrix[i][j];
            }
        }return mi;
    }
}