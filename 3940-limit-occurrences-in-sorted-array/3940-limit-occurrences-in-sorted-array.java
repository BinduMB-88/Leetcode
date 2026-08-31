class Solution {
    public int[] limitOccurrences(int[] n, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n.length;i++)
        {
            m.put(n[i],m.getOrDefault(n[i],0)+1);
        }
        ArrayList<Integer> s=new ArrayList<>();
        for(int i:m.keySet())
        {
            if(m.get(i)<=k)
            {
                int j=m.get(i);
                while(j!=0)
                {
                    s.add(i);
                    j--;
                }
            }
            else
            {
                int p=k;
                while(p!=0)
                {
                    s.add(i);
                    p--;
                }
            }

        }
        int[] r = new int[s.size()];

for(int i=0; i<s.size(); i++)
{
    r[i] = s.get(i);
}
Arrays.sort(r);
return r;
    }
}