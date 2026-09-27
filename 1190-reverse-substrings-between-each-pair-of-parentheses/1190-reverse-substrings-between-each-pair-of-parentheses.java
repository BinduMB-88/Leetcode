class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);

        while (sb.indexOf("(") != -1) {
            int close = sb.indexOf(")");
            int open = sb.lastIndexOf("(", close);

            StringBuilder temp = new StringBuilder(
                sb.substring(open + 1, close)
            );

            temp.reverse();

            sb.replace(open, close + 1, temp.toString());
        }

        return sb.toString();
    }
}