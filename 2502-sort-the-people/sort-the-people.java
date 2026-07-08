class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
       HashMap<Integer, String> map = new HashMap<>();
       for (int i = 0; i < names.length; i++) {
        map.put( heights[i],names[i]);
        }
        Arrays.sort(heights);
        int ind=0;
        String[]str=new String[names.length];
        for(int i=heights.length-1;i>-1;i--){
            str[ind++]=map.get(heights[i]);
        }
        return str;
    }
}