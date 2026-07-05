class Solution {
    public int countNegatives(int[][] grid) {
        int c=0,r=grid.length,col=grid[0].length;
        for(int i=0;i<r;i++){
         for(int j=0;j<col;j++){
         if(grid[i][j]<0) 
         c++;
         }   
        }
        return c;
    }
}