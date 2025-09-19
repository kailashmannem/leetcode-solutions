class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] indegree = new int[n];
        boolean[] outdegree = new boolean[n];
        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0] - 1, b = trust[i][1] - 1;
            indegree[b] += 1;
            outdegree[a] = true;
        }
        for (int i = 0; i < n; i++) {
            if (indegree[i] == n - 1 && !outdegree[i]) return i + 1;
        }
        return -1;
    }
}