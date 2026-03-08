class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] n1=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            n1[2*i]=nums[i];
            n1[2*i+1]=nums[i+n];
        }
        return n1;
    }
}