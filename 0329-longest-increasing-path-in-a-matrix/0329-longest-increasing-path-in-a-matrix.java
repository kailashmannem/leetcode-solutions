class Solution {
    private int[][] directions = new int[][]{{1,0}, {-1,0}, {0,1}, {0,-1}};
    private int m, n;
    public int longestIncreasingPath(int[][] matrix) {
        m = matrix.length; 
        n = matrix[0].length;
        int[][] dp = new int[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, dfs(i, j, matrix, dp));
            }
        }
        return ans;
    }
    private int dfs(int x, int y, int[][] matrix, int[][] dp) {
        if (dp[x][y] != 0) return dp[x][y];
        int max = 1;
        for (int[] direction : directions) {
            int nx = x + direction[0], ny = y + direction[1];
            if (nx >= 0 && ny >= 0 && nx < m && ny < n && matrix[nx][ny] > matrix[x][y]) {
                max = Math.max(max, 1 + dfs(nx, ny, matrix, dp));
            }
        }
        dp[x][y] = max;
        return max;
    }
}