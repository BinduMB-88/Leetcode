class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> m=new HashMap<>();
        String [] s0=s1.split(" ");
        String [] s3=s2.split(" ");
        for( String l:s0)
        {
            m.put(l,m.getOrDefault(l,0)+1);
        }
        for( String l:s3)
        {
            m.put(l,m.getOrDefault(l,0)+1);
        }
        ArrayList<String> k=new ArrayList<>();
        for(String p:m.keySet())
        {
            if(m.get(p)==1)
            {
                k.add(p);
            }
        }
        String[] f=k. toArray(new String[0]);

        return f;
    }
}