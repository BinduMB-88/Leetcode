class Solution {
    public int numIdenticalPairs(int[] n) {
        int c=0;
        int l=0;
        int r=n.length-1;
        for(int i=0;i<r;i++)
        {
            for(int j=i+1;j<r+1;j++)
            {
                if(n[i]==n[j])
                {
                    c++;
                }
            }
        }
        return c;
    }
}