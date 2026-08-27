class Solution {
    public int sumOfUnique(int[] n) {
HashMap<Integer, Integer> m = new HashMap<>();

for (int i = 0; i < n.length; i++) {

    m.put(n[i], m.getOrDefault(n[i], 0) + 1);
}
int s=0;
for(int k :m.keySet())
{
    if(m.get(k)==1)
    {
        s+=k;
    }
}
return s;
    }
}