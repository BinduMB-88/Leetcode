class Solution {
    public int distributeCandies(int[] c) {
        int n=c.length;
        HashSet<Integer> m=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            m.add(c[i]);
        }
        int p=n/2;
        if(m.size()<p){
            return m.size();
        }
        else
        {
            return p;
        }
    }
}