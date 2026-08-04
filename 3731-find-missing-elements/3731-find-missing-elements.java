class Solution {
    public List<Integer> findMissingElements(int[] n) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> m=new ArrayList<>();
        ArrayList<Integer> p=new ArrayList<>();
        for(int i=0;i<n.length;i++)
        {
            if(n[i]<min)
            {
                min=n[i];
            }
            if(max<n[i])
            {
                max=n[i];
            }
            m.add(n[i]);
        }

        for(int i=min+1;i<max;i++)
        {
            if(!m.contains(i))
            {
                p.add(i);
            }
        }
        return p;
    }
}