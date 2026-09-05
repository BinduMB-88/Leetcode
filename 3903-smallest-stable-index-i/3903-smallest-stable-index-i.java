class Solution {
    public int firstStableIndex(int[] n, int k) {
        int r = 0;

        for (int i = 0; i < n.length; i++) {
            int j = 0;
            int max = n[j];
            int min = n[i];

            for (int m = 0; m <= i; m++) {
                if (max < n[m]) {
                    max = n[m];
                }
            }
            for(int l=i;l<n.length;l++)
            {
                 if (min > n[l]) {
                    min = n[l];
                }
            }

            int inst = max - min;

            if (inst <= k) {
                r = i;
                return r;
            }
        }

        return -1;
    }
}