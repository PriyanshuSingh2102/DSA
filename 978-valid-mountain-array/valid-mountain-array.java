class Solution {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length - 1;
        int i = 0;
        while (i < len && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == len) {
            return false;
        }

        while (i < len && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == len;
    }
}