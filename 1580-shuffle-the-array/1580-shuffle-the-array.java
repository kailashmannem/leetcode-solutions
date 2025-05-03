class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            result[j++] = nums[i];
            result[j++] = nums[n + i];
        }
        return result;
    }
}