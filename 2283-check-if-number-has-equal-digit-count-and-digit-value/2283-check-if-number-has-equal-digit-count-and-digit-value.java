class Solution {
    public boolean digitCount(String num) {
        int[] a = Arrays.stream(num.split(""))
                       .mapToInt(Integer::parseInt)
                       .toArray();

        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            m.put(a[i], m.getOrDefault(a[i], 0) + 1);
        }

        for (int j = 0; j < a.length; j++) {
            if (m.getOrDefault(j, 0) != a[j]) {
                return false;
            }
        }

        return true;
    }
}