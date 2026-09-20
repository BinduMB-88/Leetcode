class Solution {
    public int reverseDegree(String s) {
        //int [] a=new int[26];
        int su=0;

        for(int i=0;i<s.length();i++)
        {
            int a=s.charAt(i)-'a';
            a++;
            int k=27-a;
            su+=k*(i+1);
        }
        return su;
    }
}