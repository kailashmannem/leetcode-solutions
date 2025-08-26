class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max_area = -1, max_value = -1;
        for (int[] len : dimensions) {
            int val = len[0]*len[0] + len[1]*len[1];
            int area = len[0] * len[1];
            if (val > max_value) {
                max_value = val;
                max_area = area;
            }
            else if (val == max_value) {
                max_area = Math.max(area, max_area);
            }
        }
        return max_area;
    }
}