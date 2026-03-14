class Solution {
    public int countDigits(int n) {
        int c=0;
        int t=n;
        while(n!=0)
        {
            int r=n%10;
            //if(r>9) r/=10;
            if(t%r==0) c++;
            
            n=n/10;
        }
        return c;
    }
}