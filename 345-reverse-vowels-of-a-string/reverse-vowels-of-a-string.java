class Solution {
    public String reverseVowels(String s) {
        String [] s1=new String[s.length()];
        for(int c=0;c<s1.length;c++)
        {
            s1[c] = String.valueOf(s.charAt(c));
        }
        int l=0,r=s1.length-1;
        while(r>l){
        if("aeiouAEIOU".contains(s1[l])){

if("aeiouAEIOU".contains(s1[r])){
    String t=s1[l];
    s1[l]=s1[r];
    s1[r]=t;
    l++;
    r--;
}
else r--;
}
else l++;
    }
    return String.join("",s1);
    }
}