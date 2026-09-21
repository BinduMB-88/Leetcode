class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] f=new int[1001];
        int[] r= new int[Math.min(nums1.length,nums2.length)];
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            f[nums1[i]]++;
        }
        for (int i=0; i<nums2.length;i++)
        {
            if(f[nums2[i]]>0){
                r[k]=nums2[i];
                f[nums2[i]]--;
                k++;
            }
        }
        return Arrays.copyOf(r, k);
    }
}