class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a = grid.length, b = grid[0].length;
        int t = a * b;
        int[] count = new int[t + 1];

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                count[grid[i][j]]++;
            }
        }

        int[] ar = new int[2];

        for(int i = 1; i <= t; i++) {
            if(count[i] == 2) {
                ar[0] = i;
            }
            if(count[i] == 0) {
                ar[1] = i;
            }
        }

        return ar;
    }
}