class Solution {
    public int findMin(int[] n) {
        Arrays.sort(n);
        return n[0];
    }
}