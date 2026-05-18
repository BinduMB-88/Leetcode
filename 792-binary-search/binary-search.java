class Solution {
    public int search(int[] n, int t) {
        int l=0,r=n.length-1;
        while(l<=r)
        {
            int m=l+((r-l)/2);
            if(t==n[m]) return m;
            else if(t<n[m]) {
              //  l=0;
                r=m-1;
            }
            else{
                l=m+1;
                //r=n.length-1;
            } 
        }
        return -1;
        
    }
}