class Solution {
    public int arrangeCoins(int n) {
        int c=0;
        int k=1;
        while(n>=k)
        {
            n-=k;
            c++;
            k++;
        }
        return c;
    }
}