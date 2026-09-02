class Solution {
    public int firstUniqChar(String s) {
        char [] c=s.toCharArray();
        int [] m=new int [26];
        for(char i:c)
        {
            m[i-'a']++;
        }
        for(int i=0;i<c.length;i++)
        {
            char k=c[i];
            if(m[k-'a']==1)
            {
                return i;
            }
        }
        return -1;
    }
}