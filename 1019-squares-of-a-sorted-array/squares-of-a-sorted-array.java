class Solution {
    public int[] sortedSquares(int[] n) {
        int [] a=new int[n.length];
        for(int i=0;i<n.length;i++)
        {
            a[i]=n[i]*n[i];
        }
        
         Arrays.sort(a);
         return a;
        
    }
}