class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] directions = new int[][]{{-1,0}, {1,0}, {0,1}, {0,-1}};
        int[][] dp = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        // Add into Queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    dp[i][j] = 0;
                    queue.offer(new int[]{i, j, 0});
                }
                else {
                    dp[i][j] = -1;
                }
            }
        }
        // BFS
        while (!queue.isEmpty()) {
            int x = queue.peek()[0], y = queue.peek()[1], count = queue.peek()[2];
            queue.poll();
            for (int[] d : directions) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n && dp[nx][ny] == -1) {
                    dp[nx][ny] = count + 1;
                    queue.offer(new int[]{nx, ny, count + 1});
                }
            }
        }
        return dp;
    }
}