class Solution {
    public int[] sortArrayByParity(int[] n) {
        int m=n.length;
        int[] p=new int[m];
        int k=0;
        int c=0;
        int[] l=new int[m];
        
        for(int i=0;i<m;i++)
        {
            if(n[i]%2==0)
            {
                p[k]=n[i];
                k++;
            }
            else
            {
                l[c]=n[i];
                c++;
            }
        }
        for(int i=0;i<c;i++)
        {
            p[k]=l[i];
            k++;
        }
        
        return p;

    }
}