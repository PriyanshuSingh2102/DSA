class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int size=piles.length,max=Integer.MIN_VALUE;
        if(size==1) 
        return (int)Math.ceil((double)piles[0]/h);
        for(int i=0;i<size;i++) 
         max= Math.max(max,piles[i]);
        int low=1,high=max,ans=max;
        while(high>=low){
         int mid = low + (high - low) / 2;
            long sum=0;
            for(int i=0;i<size;i++){
                
                sum+=Math.ceil((double)piles[i] / mid);
            }
            if(sum<=h){
            ans = mid;
            high = mid - 1;
            }
            else  
            low= mid+1;

        }
        return ans;
    }
}