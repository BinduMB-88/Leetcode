class Solution {
    public int missingMultiple(int[] n, int k) {
        Arrays.sort(n);

        int m = k;

        for (int i = 0; i < n.length; i++) {
            if (n[i] == m) {
                m += k;
            }
        }

        return m;
    }
}