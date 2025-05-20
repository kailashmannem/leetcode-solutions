class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] res = new int[nums.length+1];
        for (int i = 0; i < queries.length; i++) {
            res[queries[i][0]] += 1;
            res[queries[i][1]+1] -= 1;
        }
        for (int i = 1; i < res.length; i++) {
            res[i] += res[i-1];
            if (nums[i-1] > res[i-1]) return false;
        }
        return true;
    }
}