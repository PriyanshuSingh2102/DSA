class Solution {
    public int[][] transpose(int[][] matrix) {
       int n=matrix[0].length,n1=matrix.length;
       int [][] res=new int[n][n1]; 
       for(int i=0;i<n1;i++){
        for(int j=0;j<n;j++){
            res[j][i]=matrix[i][j];
        }
       }
       return res;
    }
}