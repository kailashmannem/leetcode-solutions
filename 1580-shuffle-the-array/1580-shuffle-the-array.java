class Solution {
    public int[] shuffle(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + (nums[i + n] << 10);
        }
        for (int i = n - 1; i >= 0; i--) {
            int y = nums[i] >> 10;
            int x = nums[i] & 1023;
            nums[2 * i] = x;
            nums[2 * i + 1] = y;
        }
        return nums;
    }
}