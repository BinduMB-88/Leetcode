class Solution {
    public int maxDistinct(String s) {
       HashSet<Character> m=new HashSet<>();
       for(char c:s.toCharArray())
       {
        m.add(c);
       }
       return m.size(); 
    }
}