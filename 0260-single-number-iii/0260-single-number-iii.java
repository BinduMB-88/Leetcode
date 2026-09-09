class Solution {
    public int[] singleNumber(int[] nums) {
        int[] a=new int[2];
         HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int k=0;
        for(int i:m.keySet())
        {
            if(m.get(i)==1)
            {
                a[k]=i;
                k++;
            }
        }
        return a;
    }
}