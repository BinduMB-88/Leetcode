import java.util.*;

class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> addOperators(String num, int target) {
        solve(num, target, 0, 0, 0, "");
        return ans;
    }

    void solve(String num, int target, int idx,
               long value, long prev, String path) {

        if (idx == num.length()) {
            if (value == target)
                ans.add(path);
            return;
        }

        for (int i = idx; i < num.length(); i++) {

            if (i != idx && num.charAt(idx) == '0')
                break;

            String s = num.substring(idx, i + 1);
            long cur = Long.parseLong(s);

            if (idx == 0) {
                solve(num, target, i + 1, cur, cur, s);
            } else {

                solve(num, target, i + 1,
                        value + cur, cur,
                        path + "+" + s);

                solve(num, target, i + 1,
                        value - cur, -cur,
                        path + "-" + s);

                solve(num, target, i + 1,
                        value - prev + prev * cur,
                        prev * cur,
                        path + "*" + s);
            }
        }
    }
}