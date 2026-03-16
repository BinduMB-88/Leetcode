class Solution {
    public int countKeyChanges(String s) {
        int c = 0;

        for(int i = 0; i < s.length() - 1; i++) {
            char ch1 = Character.toLowerCase(s.charAt(i));
            char ch2 = Character.toLowerCase(s.charAt(i + 1));

            if(ch1 != ch2) {
                c++;
            }
        }

        return c;
    }
}