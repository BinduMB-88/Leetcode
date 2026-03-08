class Solution {
    public int[] getConcatenation(int[] n) {
        int [] a=new int[2*n.length];
        for(int i=0;i<n.length;i++)
        {
            a[i]=n[i];
        }
        int c=0;
         for(int i=n.length;i<a.length;i++)
        {
            a[i]=n[c];
            c++;
        }
        return a;
    }
}