class Solution {
    public int minStartValue(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[i-1];

        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(min>nums[i])
            {
                min=nums[i];
            }
        }
        return Math.max(1, 1 - min);
    }
}