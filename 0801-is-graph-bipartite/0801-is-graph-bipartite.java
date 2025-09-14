class Solution {
    private int m;
    public boolean isBipartite(int[][] graph) {
        m = graph.length;
        int[] color = new int[m];
        Arrays.fill(color, -1);
        for (int i = 0; i < m; i++) {
            if (color[i] == -1) {
                if (!check(i, graph, color)) return false;
            }
        }
        return true;
    }
    private boolean check(int x, int[][] graph, int[] color) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        color[x] = 0;
        while(!queue.isEmpty()) {
            int point = queue.poll();
            for (int node : graph[point]) {
                if (color[node] == -1) {
                    color[node] = 1 - color[point];
                    queue.offer(node);
                }
                else if (color[node] == color[point]) {
                    return false;
                }
            }
        }
        return true;
    }
}