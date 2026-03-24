class Solution {
    public int minimumOperations(int[] n) {
        int c=0;
        for(int i=0;i<n.length;i++)
        {
            int r=n[i]%3;
            if(r>3||(r<3&&r!=0)) 
             c++;
        }
        return c;
    }
}