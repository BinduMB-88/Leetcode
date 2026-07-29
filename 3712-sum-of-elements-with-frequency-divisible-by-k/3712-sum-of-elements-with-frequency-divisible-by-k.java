class Solution {
    public int sumDivisibleByK(int[] n, int r) {
        int max=n[0];
        for(int i=1;i<n.length;i++)
        {
            if(max<n[i])
            {
                max=n[i];
            }
        }
        int [] k=new int[max+1];
         for(int i=0;i<n.length;i++)
        {
            k[n[i]]++;
        }
        int s=0;
        for(int i=0;i<k.length;i++)
        {
            if(k[i]%r==0)
            {
                s+=i*k[i];
            }
        }
        return s;
        
    }
}