class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        char[] c= moves.toCharArray();
        int l=0,r=0,re=0,s=0;
        for(int i=0;i<c.length;i++)
        {
          if(c[i]=='L')
          {
            l++;
          }
          else if(c[i]=='R')
          {
            r++;
          }
          else
          {
            s++;
          }
        }
        int k=0;
        if(l==0&&r==0||l==r)
        {
            return s;
        }
        else if(r>l)
        {
            r+=s;
        }
        else
        {
            l+=s;
        }  return Math.abs(l-r);
    }
}