class Solution {
    public int subarraySum(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            int st=Math.max(0,i-nums[i]);
            for(int j=st;j<=i;j++)
            {
                s+=nums[j];
            }
        }
        return s;
    }
}