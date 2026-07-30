class Solution {
    public int minimumPushes(String w) {
        char [] p=w.toCharArray();
        HashMap<Character,Integer> m=new HashMap<>();
        for(char k:p)
        {
            m.put(k,m.getOrDefault(k,0)+1);
        }
        int [] a= new int [m.size()];
        int i=0;
        for(int l:m.values())
        {
            a[i]=l;
            i++;
        }
       Arrays.sort(a);
       int b=0;
       int h=a.length-1;
        while(b<h)
        {
            int t=a[b];
            a[b]=a[h];
            a[h]=t;
            b++;
            h--;
        }
        int c=0;
        int s=0;
        for(int j=0;j<a.length;j++)
        {
            if(c<8)
            {
                s+=a[j];
                c++;
            }
            else if(c>7&&c<16)
            {
                s+=a[j]*2;
                c++;
            }
            else if(c>15&&c<24)
            {
                s+=a[j]*3;
                c++;
            }
            else
            {
                s+=a[j]*4;
                c++;
            }
        }
        return s;
    }
}