class Solution {
    public int smallestNumber(int n, int t) {
        int product = 1;
        int temp = n;

        while (temp != 0) {
            product *= temp % 10;
            temp /= 10;
        }

        if (product % t == 0)
            return n;

        for (int i = n + 1; ; i++) {
            int p = 1;
            int m = i;

            while (m != 0) {
                p *= m % 10;
                m /= 10;
            }

            if (p % t == 0)
                return i;
        }
    }
}