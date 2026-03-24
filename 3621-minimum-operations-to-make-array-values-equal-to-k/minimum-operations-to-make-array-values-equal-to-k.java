class Solution {
    public int minOperations(int[] n, int k) {
        int c=0;
        //if(n.length ==1) return 0;
        Set <Integer> m=new HashSet<>();
        for(int i=0;i<n.length;i++)
        {
            m.add(n[i]);
        }
        for(Integer x:m)
        {
            if(x<k) return -1;
            if(x>k)
             c++;
        }
        
        return c;
        
    }
}