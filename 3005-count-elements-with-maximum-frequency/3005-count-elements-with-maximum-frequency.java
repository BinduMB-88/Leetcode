class Solution {
    public int maxFrequencyElements(int[] n) {
        // int [] m=new int[n.length];
        int max=n[0];
        for(int i=1;i<n.length;i++)
        {
            if(max<n[i])
            {
                max=n[i];
            }
        }
        int [] m=new int[max+1];
        for(int i=0;i<n.length;i++)
        {
            m[n[i]]++;
        }
        int f=0;
        int s=0;
        int c=1;
        for(int i=1;i<m.length;i++)
        {
            if(m[i]>f)
            {
               f=m[i];
               s=f;
            }
            else if(m[i]==f)
            {
                s+=f;
            }

        }
        return s;
    }
}