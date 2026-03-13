import java.util.Arrays;

class Solution {
    public int[] numberGame(int[] n) {
        Arrays.sort(n);

        for(int i = 0; i < n.length; i += 2){
            int t = n[i];
            n[i] = n[i+1];
            n[i+1] = t;
        }

        return n;
    }
}