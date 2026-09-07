class Solution {
    public int firstUniqueEven(int[] n) {
        int [] a=new int[101];
        for(int i=0;i<n.length;i++)
        {
            a[n[i]]++;
        }
        for(int i=0;i<n.length;i++)
        {
            if(a[n[i]]==1 && n[i]%2==0)
            {
                return n[i];
            }
        }
        return -1;
    }
}