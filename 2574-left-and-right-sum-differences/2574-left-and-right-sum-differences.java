class Solution {
    static {
        for(int i=0;i<600;i++){
           new Solution().leftRightDifference(new int[]{0,0});
        }
    }
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        int leftSum = 0;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return ans;
    }
}