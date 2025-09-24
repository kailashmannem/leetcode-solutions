class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int min = -1;
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<int[]>());
        for (int[] time : times) adj.get(time[0]).add(new int[]{time[1], time[2]});
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
        pq.offer(new int[]{0, k});
        while (!pq.isEmpty()) {
            int time = pq.peek()[0], node = pq.peek()[1];
            pq.poll();
            for (int[] adjNode : adj.get(node)) {
                int nnode = adjNode[0], ntime = adjNode[1];
                if (time + ntime < dist[nnode]) {
                    dist[nnode] = time + ntime;
                    pq.offer(new int[]{dist[nnode], nnode});
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            min = Math.max(min, dist[i]);
            if (min == Integer.MAX_VALUE) return -1;
        }
        return min;
    }
}