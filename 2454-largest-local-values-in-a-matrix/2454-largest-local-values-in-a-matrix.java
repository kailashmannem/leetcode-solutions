class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] result = new int[grid.length-2][grid.length-2];
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid.length - 2; j++) {
                result[i][j] = localMax(grid, i, j);
            }
        }
        return result;
    }

    public int localMax(int[][] matrix, int a, int b) {
        int maximum = -1;
        for (int i = a; i < a + 3; i++) {
            for (int j = b; j < b + 3; j++) {
                if (matrix[i][j] > maximum) maximum = matrix[i][j];
            }
        }
        return maximum;
    }
}