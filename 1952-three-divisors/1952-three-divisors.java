class Solution {
    public boolean isThree(int n) {
        int c = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    c += 1;
                } else {
                    c += 2; 
                }
            }
        }
        return c == 3;
    }
}
