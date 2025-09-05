class Solution {
    public int numIslands(char[][] grid) {
        int[][] directions = {{-1,0}, {1,0}, {0,1}, {0,-1}};
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count += 1;
                    bfs(grid, directions, i, j);
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, int[][] directions, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i,j});
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            for (int[] direction : directions) {
                int x = node[0] + direction[0], y = node[1] + direction[1];
                if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == '1') {
                    grid[x][y] = '0';
                    queue.offer(new int[]{x,y});
                }
            }
        }
    }
}