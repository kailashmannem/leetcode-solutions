class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                count += 1;
                dfs(i, visited, isConnected);
            }
        }
        return count;
    }
    private void dfs(int node, boolean[] visited, int[][] isConnected) {
        visited[node] = true;
        for (int j = 0; j < isConnected[0].length; j++) {
            if (!visited[j] && isConnected[node][j] == 1) {
                dfs(j, visited, isConnected);
            }
        }
    }
}