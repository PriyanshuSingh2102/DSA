class Solution {
    public int maxSum(int[] nums) {
        int[] max1=new int[nums.length];
        int c=0,res=-1;
        for(int i=0;i<nums.length;i++){
            int n=nums[i],max=0;
            while(n>0){
                if((n%10)>max)
                max=n%10;
                n/=10;
            }
            max1[i]=max;
        }
         for(int j=0;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
               if(max1[j] == max1[k]) {
                    res = Math.max(res, nums[j] + nums[k]);

            }
            } 
         }
         return res;
    }
}