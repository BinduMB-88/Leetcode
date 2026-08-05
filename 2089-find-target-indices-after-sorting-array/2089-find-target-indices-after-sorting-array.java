class Solution {
    public List<Integer> targetIndices(int[] n, int t) {
        Arrays.sort(n);
        ArrayList<Integer> m=new ArrayList<>();
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==t)
            {
                m.add(i);
            }
        }
        return m;
    }
}