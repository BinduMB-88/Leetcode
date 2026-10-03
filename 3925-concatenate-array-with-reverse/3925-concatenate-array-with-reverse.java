class Solution {
    public int[] concatWithReverse(int[] nums) {
        int [] m=new int [2*nums.length];
        for(int i=0;i<nums.length;i++)
        {
            m[i]=nums[i];

        }
        int k=nums.length;
        for(int i=nums.length-1;i>=0;i--)
        {
            m[k]=nums[i];
            k++;
        }
        return m;

    }
}