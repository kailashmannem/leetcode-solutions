class Solution {
    public int subarraySum(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) prefixSum[i] = prefixSum[i - 1] + nums[i];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.max(0, i - nums[i]);
            sum += prefixSum[i] - (idx > 0 ? prefixSum[idx - 1] : 0);
        }
        return sum;
    }
}