class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<Integer>());
        for (int arr[] : prerequisites) {
            adj.get(arr[0]).add(arr[1]);
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
        int count = 0;
        int i = numCourses - 1;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            count += 1;
            topo[i--] = node;
            for (int it : adj.get(node)) {
                indegree[it] -= 1;
                if (indegree[it] == 0) queue.offer(it);
            }
        }
        return (count == numCourses) ? topo : new int[0];
    }
}