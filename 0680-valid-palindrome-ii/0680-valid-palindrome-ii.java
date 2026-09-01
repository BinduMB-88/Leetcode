class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                int a=i+1;
                int b=j;
                while(a<b&&s.charAt(a)==s.charAt(b))
                {
                    a++;
                    b--;
                }
                if(a>=b)
                {
                    return true;
                }
                 a=i;
                 b=j-1;
                while(a<b&&s.charAt(a)==s.charAt(b))
                {
                    a++;
                    b--;
                }
                if(a>=b)
                {
                    return true;
                }
return false;
                
            }
            i++;
            j--;
        }
        return true;
    }
}