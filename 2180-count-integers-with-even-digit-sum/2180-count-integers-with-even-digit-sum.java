class Solution {
    public int countEven(int n) {
        if(n==1||n==0) return 0;
        if(n==2||n==3) return 1;
        if(n==4||n==5) return 2;
        if(n==6||n==7) return 3;
        if(n==8||n==9) return 4;
        int c=4;
        for(int i=10;i<=n;i++)
        {
            int s=0;
            int k=i;
            while(k!=0)
            {
                s+=k%10;
                k/=10;
            }
            if(s%2==0)
            {
                c++;
            }

        }
        return c;
    }
}