class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        int[][] directions = new int[][]{{1,0}, {-1,0}, {0,1}, {0,-1}};
        int[][] distance = new int[m][n];
        for (int i = 0; i < m; i++) Arrays.fill(distance[i], Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.offer(new int[]{0, 0, 0});
        distance[0][0] = 0;
        while (!pq.isEmpty()) {
            int cost = pq.peek()[0], x = pq.peek()[1], y = pq.peek()[2];
            if (x == m - 1 && y == n - 1) return cost;
            pq.poll();
            for (int[] d : directions) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    int effort = Math.abs(heights[x][y] - heights[nx][ny]);
                    int newCost = Math.max(effort, cost);
                    if (newCost < distance[nx][ny]) {
                        distance[nx][ny] = newCost;
                        pq.offer(new int[]{newCost, nx, ny});
                    }
                    
                }
            }
        }
        return -1;
    }
}