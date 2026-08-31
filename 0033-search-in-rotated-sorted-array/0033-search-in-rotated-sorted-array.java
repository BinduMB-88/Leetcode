class Solution {
    public int search(int[] n, int t) {
        int r=-1;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==t)
            {
                r=i;
                break;
            }
        }
        return r;
    }
}