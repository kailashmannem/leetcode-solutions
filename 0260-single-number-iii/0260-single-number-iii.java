class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        int max = xor & -xor;
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if ((max & nums[i]) != 0) ans[0] ^= nums[i];
            else ans[1] ^= nums[i];
        }
        return ans;
    }
}