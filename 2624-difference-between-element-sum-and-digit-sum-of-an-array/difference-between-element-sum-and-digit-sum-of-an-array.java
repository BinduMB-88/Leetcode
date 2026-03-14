class Solution {
    public int differenceOfSum(int[] n) {
        int e=0,d=0;
        for(int i=0;i<n.length;i++)
        {
            e+=n[i];
            if(n[i]>9)
            {
                while(n[i]!=0)
                {
                    int r=n[i]%10;
                    d+=r;
                    n[i]/=10;
                }
            }
            else{
                d+=n[i];
            }
        }
        return Math.abs(e-d);
    }
}