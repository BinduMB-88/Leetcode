class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
         int r=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
           
            if(nums[i]==target&&Math.abs(i-start)<r)
            {
                r=Math.abs(i-start);
            }
        }
        return r;
    }
}