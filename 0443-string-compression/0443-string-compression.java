class Solution {
    public int compress(char[] c) {
        StringBuilder s = new StringBuilder();
        int co = 1;

        for (int i = 0; i < c.length; i++) {
            if (i + 1 == c.length || c[i] != c[i + 1]) {
                s.append(c[i]);

                if (co > 1) {
                    s.append(co);
                }

                co = 1;
            } else {
                co++;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
        }

        return s.length();
    }
}