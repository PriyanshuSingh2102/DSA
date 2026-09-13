class Solution {
    public void rotate(int[] nums, int k) {
        int size=nums.length;
        k=k%size;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){                                                                      int t=i+k;
        if(t>=size)
         arr[t-size]=nums[i];
        else
            arr[i+k]=nums[i];
      } 
     for(int i=0;i<size;i++){   
        nums[i]=arr[i];
     }
     return ;
    }
}