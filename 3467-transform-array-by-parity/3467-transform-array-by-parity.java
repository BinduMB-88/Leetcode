class Solution {
    public int[] transformArray(int[] n) {
        int k=0;
        int c=0;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]%2==0)
            {
                c++;
            }
            else{
                k++;
            }
        }
        int a[] =new int [n.length];
        for(int i=0;i<c;i++)
        {
            a[i]=0;
        }
         for(int i=c;i<n.length;i++)
        {
            a[i]=1;
        }
        return a;
    }
}