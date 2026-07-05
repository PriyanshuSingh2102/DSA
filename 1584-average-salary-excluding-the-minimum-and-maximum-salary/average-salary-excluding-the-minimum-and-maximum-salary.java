class Solution {
    public double average(int[] salary) {
        int s=0,c=0,min=salary[0],max=salary[0];
        for(int i=1;i<salary.length;i++){
            max=Math.max(max,salary[i]);
            min=Math.min(min,salary[i]);
        }
         for(int i=0;i<salary.length;i++){
            if(salary[i]!= max && salary[i]!= min) {
            s+=salary[i];
            c++;
        }}
        return (double) s/c;
    }
}