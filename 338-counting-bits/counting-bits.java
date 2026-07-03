class Solution {
    public int[] countBits(int n) {
        int[] ans= new int[n+1];
        for(int i=0;i<=n;i++){
            int t=i,c=0;
             while(t>0){
               c+=t%2;
               t/=2;
            }
            ans[i]=c;
        }
        return ans;
    }
}