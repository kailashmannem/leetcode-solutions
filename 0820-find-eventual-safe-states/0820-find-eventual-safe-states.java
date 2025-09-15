class Solution {
    private int m;
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new ArrayList<>();
        m = graph.length;
        boolean[] visited = new boolean[m];
        boolean[] path = new boolean[m];
        for (int i = 0; i < m; i++) {
            if (!dfs(i, graph, visited, path)) result.add(i);
        }
        return result;
    }
    private boolean dfs(int node, int[][] graph, boolean[] visited, boolean[] path) {
        visited[node] = true;
        path[node] = true;
        for (int it : graph[node]) {
            if (!visited[it]) {
                if (dfs(it, graph, visited, path) == true) return true;
            }
            else if (path[it]) return true;
        }
        path[node] = false;
        return false;
    }
}