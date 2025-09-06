class Solution {
    private boolean detectCycle(char[][] grid, int[][] directions, boolean[][] visited, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        visited[i][j] = true;
        queue.offer(new int[]{i, j, -1, -1});
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int x = node[0], y = node[1], px = node[2], py = node[3];
            for (int[] direction : directions) {
                int nx = x + direction[0], ny = y + direction[1];
                if (nx >= 0 && ny >= 0 && nx < grid.length && ny < grid[0].length && grid[nx][ny] == grid[x][y]) {
                    if (!visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny, x, y});
                    }
                    else if (nx != px || ny != py) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean containsCycle(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int[][] directions = new int[][]{{-1,0}, {1,0}, {0,1}, {0,-1}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    if (detectCycle(grid, directions, visited, i, j)) return true;
                }
            }
        }
        return false;
    }
}