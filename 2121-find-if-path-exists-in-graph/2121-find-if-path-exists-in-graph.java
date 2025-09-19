class Solution {
    private Map<Integer, List<Integer>> build_graph(int n, int[][] edges) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<Integer>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        return adj;
    }
    private boolean findPath(Map<Integer, List<Integer>> adj, boolean[] visited, int source, int destination) {
        if (source == destination) return true;
        visited[source] = true;
        for (int node : adj.get(source)) {
            if (!visited[node]) {
                if (findPath(adj, visited, node, destination)) return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = build_graph(n, edges);
        return findPath(graph, new boolean[n], source, destination);
    }
}