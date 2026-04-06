class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        // Check triangle validity
        if (a + b <= c || b + c <= a || a + c <= b) {
            return "none";
        }

        // Check types
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}