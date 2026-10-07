class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int ele = nums.length/3;
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i+=count){
         count=0;
         for(int j=i;j<nums.length;j++ ){
            if(nums[i]==nums[j])
            count++;
         }
         if(count>ele)
         arr.add(nums[i]);
        }
        return arr;
        }
    }
