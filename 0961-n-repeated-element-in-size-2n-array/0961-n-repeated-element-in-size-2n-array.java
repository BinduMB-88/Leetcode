class Solution {
    public int repeatedNTimes(int[] n) {
        int m=0;
        int max=n[0];
        for(int i=1;i<n.length;i++)
        {
            if(max<n[i])
            {
                max=n[i];
            }
        }
        int [] k= new int[max+1];
        for(int i=0;i<n.length;i++)
        {
            k[n[i]]++;
        }
        int l=0;
        for(int i=0;i<k.length;i++)
        {
            if(k[i]>1)
            {
                l=i;
                break;
            }
        }
        return l;
    }
}