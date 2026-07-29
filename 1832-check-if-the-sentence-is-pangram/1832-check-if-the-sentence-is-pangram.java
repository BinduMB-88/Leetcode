class Solution {
    public boolean checkIfPangram(String s) {
        int [] m= new int [26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            m[c-'a']++;
        }
        for(int i=0;i<m.length;i++)
        {
            if(m[i]==0)
            {
                return false;
            }
        }
        return true;
    }
}