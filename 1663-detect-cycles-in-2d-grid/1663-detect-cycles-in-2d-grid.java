class Solution {
    private boolean detectCycle(char[][] grid, int[][] directions, boolean[][] visited, int i, int j) {
        Queue<int[][]> queue = new LinkedList<>();
        visited[i][j] = true;
        queue.offer(new int[][]{{i, j}, {-1, -1}});
        while (!queue.isEmpty()) {
            int[] node = queue.peek()[0];
            int[] parent = queue.peek()[1];
            queue.poll();
            for (int[] direction : directions) {
                int x = node[0] + direction[0], y = node[1] + direction[1];
                if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] == grid[node[0]][node[1]]) {
                    if (!visited[x][y]) {
                        visited[x][y] = true;
                        queue.offer(new int[][]{{x, y}, {node[0], node[1]}});
                    }
                    else if (x != parent[0] || y != parent[1]) {
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