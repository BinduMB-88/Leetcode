class Solution {
    public String reverseWords(String s) {
        String [] s1= s.trim().split("\\s+");
        int i=0;
        int j=s1.length-1;
        while(i<j)
        {
            String t=s1[i];
            s1[i]=s1[j];
            s1[j]=t;
            i++;
            j--;
        }
        String r=String.join(" ", s1);
        return r;
    }
}