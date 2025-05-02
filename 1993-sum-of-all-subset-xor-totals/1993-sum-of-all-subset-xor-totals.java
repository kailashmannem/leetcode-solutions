class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0;
        for (int num = 0; num < (1<<nums.length); num++) {
            int i = num, j = 0;
            int count = 0;
            while (i!=0) {
                if ((i&1)==1) {
                    count ^= nums[j];
                }
                j++;
                i >>= 1;
            }
            sum += count;
        }
        return sum;
    }
}