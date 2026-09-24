class Solution {
    public int smallestIndex(int[] n) {
        
        for (int i=0;i<n.length;i++)
        {
            int d=0;
            int m=n[i];
            
            while(m!=0)
            {
               d+=m%10;
               m=m/10;
            }
            
            

            if(i==d)
            return i;
        }
        return -1;
        
    }
}