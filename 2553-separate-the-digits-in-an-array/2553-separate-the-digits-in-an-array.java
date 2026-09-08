class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 10) {
                a.add(nums[i]);
            }
            else {
                ArrayList<Integer> temp = new ArrayList<>();

                while(nums[i] != 0) {
                    temp.add(nums[i] % 10);
                    nums[i] /= 10;
                }

                for(int j = temp.size() - 1; j >= 0; j--) {
                    a.add(temp.get(j));
                }
            }
        }

        int[] result = new int[a.size()];

        for(int i = 0; i < a.size(); i++) {
            result[i] = a.get(i);
        }

        return result;
    }
}
