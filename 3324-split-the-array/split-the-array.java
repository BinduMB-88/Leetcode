class Solution {
    public boolean isPossibleToSplit(int[] n) {
        HashMap<Integer,Integer> m= new HashMap<>();
        for(int i=0;i<n.length;i++)
        {
            m.put(n[i],m.getOrDefault(n[i],0)+1);
        }
        for (Integer value : m.values()) {
    
    if(value>2) return false;
}
  return true;  }
}