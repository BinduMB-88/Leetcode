class Solution {
    public boolean containsDuplicate(int[] n) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n.length;i++)
        {
            m.put(n[i],m.getOrDefault(n[i],0)+1);
        }
        for(Integer x:m.keySet())
        {
            if(m.get(x)>1) return true;
        }
        return false;
        
    }
}