class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       List<Integer> first = new ArrayList<>();
       List<List<Integer>> sec = new ArrayList<>(); 
       for(int i=0;i<nums1.length;i++){
        int c=-1;
        for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
            c=0;
            break;}
        }
        if(c==-1&& !first.contains(nums1[i]))
        first.add(nums1[i]);
       }
       sec.add(first);
       List<Integer> second =new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
        int c=-1;
        for(int j=0;j<nums1.length;j++){
            if(nums2[i]==nums1[j]){
            c=0;
            break;}
        }
        if(c==-1&& !second.contains(nums2[i]))
        second.add(nums2[i]);
       }
       sec.add(second);
       return sec;
    }
}