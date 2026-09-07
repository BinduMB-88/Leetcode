class Solution {
    public int[] recoverOrder(int[] o, int[] f) {
        int [] a=new int [f.length];
        int k=0;
        for(int i=0;i<o.length;i++)
        {
            for(int j=0;j<f.length;j++)
            {
                if(o[i]==f[j])
                {
                    a[k]=o[i];
                    k++;
                }
            }
        }
        return a;
    }
}