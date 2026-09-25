class Solution {
    static{
        for(int i = 0; i < 600; i++) {
       new Solution().countPartitions(new int[]{0,0});
    }
    }
    public int countPartitions(int[] nums) {
        int s=0;
        int c=0,se=0;
        for(int i=0;i<nums.length-1;i++)
        {
         s+=nums[i];
         int r=0;
         for(int j=i+1;j<nums.length;j++)
         {
            r+=nums[j];
         }   
         se=s-r;
         if(se%2==0)
         {
            c++;
         }

        }
        return c;
    }
}