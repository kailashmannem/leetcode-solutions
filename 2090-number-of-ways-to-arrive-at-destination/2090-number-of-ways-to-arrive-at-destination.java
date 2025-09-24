class Solution {
    private int mod = (int) 1e9 + 7;
    public int countPaths(int n, int[][] roads) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<int[]>());
        for (int[] road : roads) {
            adj.get(road[0]).add(new int[]{road[1], road[2]});
            adj.get(road[1]).add(new int[]{road[0], road[2]});
        }
        long[] dist = new long[n];
        int[] ways = new int[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        ways[0] = 1;
        PriorityQueue<long[]> queue = new PriorityQueue<>((a,b) -> Long.compare(a[0], b[0]));
        queue.offer(new long[]{0L, 0});
        while (!queue.isEmpty()) {
            long cost = queue.peek()[0]; 
            int node = (int) queue.peek()[1];
            queue.poll();
            if (cost > dist[node]) continue;
            for (int[] adjNode : adj.get(node)) {
                int nnode = adjNode[0];
                long ncost = adjNode[1];
                if (cost + ncost < dist[nnode]) {
                    dist[nnode] = cost + ncost;
                    queue.offer(new long[]{dist[nnode], nnode});
                    ways[nnode] = ways[node];
                }
                else if (cost + ncost == dist[nnode]) ways[nnode] = (ways[nnode] + ways[node]) % mod;
            }
        }
        return ways[n-1];
    }
}