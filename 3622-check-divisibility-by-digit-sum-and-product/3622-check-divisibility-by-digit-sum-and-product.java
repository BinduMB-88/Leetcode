class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int p=1;
        int o=n;
        while(n!=0)
        {
            int r=n%10;
            s+=r;
            p*=r;
            n/=10;
        }
        int t=s+p;
        return o%t==0;
    }
}