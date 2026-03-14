class Solution {
    public int xorOperation(int n, int s) {
        int x=0;
        for(int i=0;i<n;i++)
        {
            int k=s+2*i;
            x=x^k;
        }
        return x;
    }
}