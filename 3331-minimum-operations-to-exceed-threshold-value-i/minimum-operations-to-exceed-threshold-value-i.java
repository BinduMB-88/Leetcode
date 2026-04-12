class Solution {
    public int minOperations(int[] n, int k) {
        int c=0;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]<k)
            {
                c++;
            }
        }
        return c;
    }
}