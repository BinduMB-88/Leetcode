class Solution {
    public int maxProduct(int n) {
        int m=0;
        ArrayList<Integer> k=new ArrayList<>();
        while(n!=0)
        {
            int r=n%10;
            k.add(r);
            n/=10;
        }
        for(int i=0;i<k.size()-1;i++)
        {
            for(int j=i+1;j<k.size();j++)
            {
            if(k.get(i)*k.get(j)>m)
            {
                m=k.get(i)*k.get(j);
            }
        }

        }
        return m;
    }
}