class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] res = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            res[i] = points[i][0];
        }
        Arrays.sort(res);
        int max = -1;
        for (int i = 0; i < res.length - 1; i++) {
            int p = res[i+1] - res[i];
            if (max < p) {
                max = p;
            }
        }
        return max;
    }
}