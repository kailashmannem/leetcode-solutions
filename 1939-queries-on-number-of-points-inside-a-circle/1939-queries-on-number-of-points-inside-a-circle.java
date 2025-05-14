class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] res = new int[queries.length];
        int i = 0;
        for (int[] q : queries) {
            int count = 0;
            for (int[] p : points) {
                if (Math.pow(p[0] - q[0],2) + Math.pow(p[1] - q[1],2) <= Math.pow(q[2],2)) {
                    count++;
                }
            }
            res[i] = count;
            i++;
        }
        return res;
    }
}