class Solution {
    public int maxFreqSum(String s) {
        char[] s1 = s.toCharArray();

        HashMap<Character, Integer> k = new HashMap<>();

        for (int i = 0; i < s1.length; i++) {
            k.put(s1[i], k.getOrDefault(s1[i], 0) + 1);
        }
        int m1=0;
        int m2=0;
        for (int i = 0; i < s1.length; i++)
        {
            if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u')
            {
                if(m1<k.get(s1[i]))
                {
                    m1=k.get(s1[i]);
                }
            }
            else
            {
                if(m2<k.get(s1[i]))
                {
                    m2=k.get(s1[i]);
                }
            }
        }
        return m1+m2;
    }
}