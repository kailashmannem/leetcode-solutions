class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] indegree = new int[n];
        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0] - 1, b = trust[i][1] - 1;
            indegree[b] += 1;
            indegree[a] -= 1;
        }
        for (int i = 0; i < n; i++) {
            if (indegree[i] == n - 1) return i + 1;
        }
        return -1;
    }
}