class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = new int[][]{{-1,0}, {1,0}, {0,1}, {0,-1}};
        int time = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j, 0});
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            for (int[] direction : directions) {
                int x = node[0] + direction[0], y = node[1] + direction[1];
                if (x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == 1) {
                    grid[x][y] = 2;
                    queue.offer(new int[]{x, y, node[2] + 1});
                }
            }
            time = node[2];
        }
        // For any unreachable orange
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return time;
    }
}