class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++) {
            min = Math.abs(min)>Math.abs(nums[i])?nums[i]:min;
            min = Math.abs(min)==Math.abs(nums[i])?Math.max(min,nums[i]):min;
        }
        return min;
    }
}