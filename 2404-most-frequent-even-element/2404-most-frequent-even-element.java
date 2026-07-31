class Solution {
    public int mostFrequentEven(int[] n) {
        if(n.length==1) 
        {
            if(n[0]%2==0)
            {
                return n[0];
            }
        }
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n.length;i++)
        {
            if(n[i]%2==0){
            m.put(n[i],m.getOrDefault(n[i],0)+1);
            }
        }
        if(m.size()==0)
        {
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int ma=Integer.MIN_VALUE;
        for(int i:m.keySet())
        {
            if(m.get(i)>ma)
            {
                min=i;
                ma=m.get(i);
            }
            else if(m.get(i)==ma)
            {
                min=Math.min(min,i);
            }
        }
        return min;
    }
}