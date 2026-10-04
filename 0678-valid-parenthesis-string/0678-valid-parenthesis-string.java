class Solution {
    public boolean checkValidString(String s) {
        int c = 0;
        int min = 0;

        for (char p : s.toCharArray()) {
            if (p == '(') {
                c++;
                min++;
            }
            else if (p == ')') {
                c--;
                min--;
            }
            else {
                c++;
                min--;
            }

            if (c < 0) {
                return false;
            }

            if (min < 0) {
                min = 0;
            }
        }

        return min == 0;
    }
}