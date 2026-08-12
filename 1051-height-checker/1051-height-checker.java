class Solution {
    public int heightChecker(int[] h) {
        int [] m=new int [h.length];
        for(int i=0;i<h.length;i++)
        {
            m[i]=h[i];
        }
        Arrays.sort(h);
        int c=0;
        for(int i=0;i<h.length;i++)
        {
            if(h[i]!=m[i])
            {
                c++;
            }
        }
        return c;
    }
}