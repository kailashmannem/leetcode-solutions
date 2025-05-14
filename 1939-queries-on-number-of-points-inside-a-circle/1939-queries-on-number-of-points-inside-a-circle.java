class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] res = new int[queries.length];
        int i = 0;
        for (int[] q : queries) {
            int count = 0;
            for (int[] p : points) {
                int dx = p[0] - q[0];
                int dy = p[1] - q[1];
                int r = q[2];
                if (dx*dx + dy*dy <= r*r) {
                    count++;
                }
            }
            res[i] = count;
            i++;
        }
        return res;
    }
}