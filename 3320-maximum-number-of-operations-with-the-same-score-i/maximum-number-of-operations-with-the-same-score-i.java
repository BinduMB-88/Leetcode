class Solution {
    public int maxOperations(int[] n) {
        if (n.length==2) return 1;
        int c=1;
        int s1=n[0]+n[1];
        for(int i=2;i<n.length-1;i=i+2)
        {
            int s=n[i]+n[i+1];
            if(s==s1)
            {
                c++;
            }
            else return c;
        }
        return c;
    }
}
