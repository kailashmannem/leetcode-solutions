class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] res = new int[nums.length+1];
        for (int i = 0; i < queries.length; i++) {
            res[queries[i][0]] += 1;
            res[queries[i][1]+1] -= 1;
        }
        for (int i = 1; i < res.length; i++) {
            res[i] += res[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > res[i]) return false;
        }
        return true;
    }
}