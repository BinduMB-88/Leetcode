class Solution {
    public int singleNumber(int[] nums) {
        int r=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(int i:m.keySet())
        {
            if(m.get(i)==1)
            {
                r=i;
            }
        }
        return r;
    }
}