class Solution {
    public int mirrorDistance(int n) {
        int n1=0;
        int t=n;
        while(n!=0)
        {
            n1=n%10+n1*10;
            n/=10;
        }
        return Math.abs(t-n1);
    }
}