class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for (int i = 0; i < k/2; i++) {
            int r1 = x + i, r2 = x + k - 1 - i;
            for (int j = 0; j < k; j++) {
                int temp = grid[r1][y + j];
                grid[r1][y + j] = grid[r2][y+j];
                grid[r2][y+j] = temp;
            }
        }
        return grid;
    }
}