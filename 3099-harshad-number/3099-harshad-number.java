class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s=0;
        int t=x;
        while(x!=0)
        {
            s+=x%10;
            x/=10;
        }
        if(t%s==0)
        {
            return s;
        }
        else
        {
            return -1;
        }
    }
}