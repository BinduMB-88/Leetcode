class Solution {
    public int scoreOfString(String s) {
        int su=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char c=s.charAt(i);
            char c1=s.charAt(i+1);
            int a=(int)c;
            int b=(int)c1;
            su+=Math.abs(a-b);
        }
        return su;
    }
}