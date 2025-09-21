class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        if (grid[0][0] == 1 || grid[m-1][n-1] == 1) return -1;
        if (m == 1 && n == 1 && grid[0][0] == 0) return 1;
        int[][] directions = new int[][]{{-1,0}, {1,0}, {0,1}, {0,-1}, {1,1}, {-1,-1}, {-1,1}, {1, -1}};
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.offer(new int[]{1, 0, 0});
        while (!pq.isEmpty()) {
            int dist = pq.peek()[0], x = pq.peek()[1], y = pq.peek()[2];
            pq.poll();
            for (int[] d : directions) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n && grid[nx][ny] == 0) {
                    if (nx == m - 1 && ny == n - 1) return dist + 1;
                    pq.offer(new int[]{dist + 1, nx, ny});
                    grid[nx][ny] = 1;
                }
            }
        }
        return -1;
    }
}