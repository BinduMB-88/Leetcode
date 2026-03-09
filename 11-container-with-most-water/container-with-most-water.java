class Solution {
    public int maxArea(int[] h) {
       int i=0,j=h.length-1,max=0;
       while(i<j)
       {
        int h1=Math.min(h[i],h[j]);
        int w=j-i;
        int a=h1*w;
        max=Math.max(a,max);
        if(h[i]<h[j]) i++;
        else j--;
       }
       return max;
    }
}