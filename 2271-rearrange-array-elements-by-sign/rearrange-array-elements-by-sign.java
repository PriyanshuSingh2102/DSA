class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length,pos=0,neg=1;
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            if(nums[i]>0){
                arr[pos]=nums[i];
                pos+=2;
            }
            else{
              arr[neg]=nums[i];
                neg+=2;  
            }
        }
        return arr;
    }
}