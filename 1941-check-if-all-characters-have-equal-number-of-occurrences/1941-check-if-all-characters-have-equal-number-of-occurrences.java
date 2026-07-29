class Solution {
    public boolean areOccurrencesEqual(String s) {
           char[] c=s.toCharArray();
        HashMap<Character,Integer> m=new HashMap<>();
        for(char ch:c)
        {
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        HashSet<Integer> p=new HashSet<>();
        for(int k : m.values())
        {
            p.add(k);

        }
        if(p.size()==1)
        {
            return true;
        }
        return false;
    }
}