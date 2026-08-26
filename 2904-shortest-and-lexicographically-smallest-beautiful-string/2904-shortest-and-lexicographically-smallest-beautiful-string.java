class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String[] stringArray = s.split("");
        int[] a = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            a[i] = Integer.parseInt(stringArray[i]);
        }

        StringBuilder sb = new StringBuilder();
        String ans = "";
        int l = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            int j = i;
            int c = 0;
            sb.setLength(0);

            while (j < a.length && c < k) {
                sb.append(a[j]);

                if (a[j] == 1) {
                    c++;
                }

                j++;
            }

            if (c == k) {
                if (sb.length() < l ||
                    (sb.length() == l && sb.toString().compareTo(ans) < 0)) {
                    l = sb.length();
                    ans = sb.toString();
                }
            }
        }

        return ans;
    }
}