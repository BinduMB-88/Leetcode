class Solution {
    public List<Integer> majorityElement(int[] n) {
        List<Integer> m=new ArrayList<>();
        HashMap<Integer,Integer> p=new HashMap<>();
        for(int i=0;i<n.length;i++)
        {
            p.put(n[i],p.getOrDefault(n[i],0)+1);
        }
        for(int i:p.keySet())
        {
            if(p.get(i)>n.length/3)
            {
                if(!m.contains(i)){
                m.add(i);
                }
            }
        }
        return m;
        
    }
}