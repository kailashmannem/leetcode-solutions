class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<Integer>());
        for (int arr[] : prerequisites) {
            adj.get(arr[1]).add(arr[0]);
        }
        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int it : adj.get(i)) {
                indegree[it] += 1;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }
        int[] topo = new int[numCourses];
        int i = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topo[i++] = node;
            for (int it : adj.get(node)) {
                indegree[it] -= 1;
                if (indegree[it] == 0) queue.offer(it);
            }
        }
        return (i == numCourses) ? topo : new int[0];
    }
}