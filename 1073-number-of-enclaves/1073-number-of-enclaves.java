class Solution {
    private int m, n;
    public int numEnclaves(int[][] grid) {
        m = grid.length; n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1 && !visited[i][0]) dfs(i, 0, grid, visited);
            if (grid[i][n - 1] == 1 && !visited[i][n - 1]) dfs(i, n - 1, grid, visited);
        }
        for (int j = 0; j < n; j++) {
            if (grid[0][j] == 1 && !visited[0][j]) dfs(0, j, grid, visited);
            if (grid[m - 1][j] == 1 && !visited[m - 1][j]) dfs(m - 1, j, grid, visited);
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) count += 1;
            }
        }
        return count;
    }
    private void dfs(int x, int y, int[][] grid, boolean[][] visited) {
        if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == 0 || visited[x][y]) return;
        visited[x][y] = true;
        dfs(x + 1, y, grid, visited);
        dfs(x - 1, y, grid, visited);
        dfs(x, y + 1, grid, visited);
        dfs(x, y - 1, grid, visited);
    }
}