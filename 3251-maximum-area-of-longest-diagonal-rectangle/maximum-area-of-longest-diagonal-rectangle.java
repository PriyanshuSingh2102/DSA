class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int cal = 0, t = 0;
        double area = -1;

        for (int i = 0; i < dimensions.length; i++) {
            cal = 0;

            for (int j = 0; j < dimensions[0].length; j++) {
                cal += dimensions[i][j] * dimensions[i][j];
            }

            int currentArea = dimensions[i][0] * dimensions[i][1];

            if (Math.sqrt(cal) > area) {
                area = Math.sqrt(cal);
                t = i;
            }
            else if (Math.sqrt(cal) == area) {
                int oldArea = dimensions[t][0] * dimensions[t][1];

                if (currentArea > oldArea) {
                    t = i;
                }
            }
        }

        cal = 1;

        for (int j = 0; j < dimensions[0].length; j++) {
            cal *= dimensions[t][j];
        }

        return cal;
    }
}