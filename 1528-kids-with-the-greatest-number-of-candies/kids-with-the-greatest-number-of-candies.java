class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int k) {
        ArrayList<Boolean> m=new ArrayList<>();
        int max=c[0];
        for(int i=1;i<c.length;i++)
        {
            if(max<c[i])
            {
                max=c[i];
            }
        }
        for(int i=0;i<c.length;i++)
        {
            m.add(c[i]+k>=max);
        }
        return m;
    }
}