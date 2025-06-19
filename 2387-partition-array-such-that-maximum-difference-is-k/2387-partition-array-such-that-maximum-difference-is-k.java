class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0, min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int max = nums[i];
            if (max - min > k) {
                count++;
                min = max;
            }
        }
        return count + 1;
    }
}