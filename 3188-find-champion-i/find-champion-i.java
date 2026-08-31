class Solution {
    public int findChampion(int[][] grid) {
        int n=grid.length,l=-1;
        for(int i=0;i<n;i++){
            Boolean Champion=true;
            for(int j=0;j<n;j++){
                if(i!=j && grid[i][j]==0)
                Champion = false;
            }
            if(Champion==true)
            l=i;
        }
        return l;
    }
}