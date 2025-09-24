class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<int[]>());
        }
        for (int[] flight : flights) {
            adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src] = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, src, 0});
        while (!queue.isEmpty()) {
            int stops = queue.peek()[0], node = queue.peek()[1], dist = queue.peek()[2];
            queue.poll();
            if (stops > k) continue;
            for (int[] nn : adj.get(node)) {
                int adjnode = nn[0], cost = dist + nn[1];
                if (cost < distance[adjnode] && stops <= k) {
                    distance[adjnode] = cost;
                    queue.offer(new int[]{stops + 1, adjnode, cost});
                }
            }
        }
        return (distance[dst] == Integer.MAX_VALUE) ? -1 : distance[dst];
    }
}