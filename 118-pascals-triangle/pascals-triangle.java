class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            int cij=1;
            for(int j=0;j<=i;j++){
                row.add(cij);
                int cij1= cij *(i-j)/(j+1);
                cij=cij1;
            }

            result.add(row);
        }

        return result;
    }
}