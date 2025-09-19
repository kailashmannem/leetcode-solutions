class Solution {
    private List<List<Integer>> build_graph(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return adj;
    }
    private boolean findPath(List<List<Integer>> adj, boolean[] visited, int source, int destination) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == destination) return true;
            for (int vertex : adj.get(node)) {
                if (!visited[vertex]) {
                    visited[vertex] = true;
                    queue.offer(vertex);
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = build_graph(n, edges);
        return findPath(graph, new boolean[n], source, destination);
    }
}