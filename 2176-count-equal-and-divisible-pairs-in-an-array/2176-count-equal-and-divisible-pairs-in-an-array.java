class Solution {
    public int countPairs(int[] n, int k) {
        int c=0;
        for(int i=0;i<n.length-1;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i]==n[j]&&(i*j)%k==0)
                {
                    c++;
                }
            }
        }
        return c;
    }
}