class Solution {
    public int minimumArea(int[][] grid) {
        int minX = 1001, minY = 1001, maxX = 0, maxY = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }
        return (maxX - minX + 1) * (maxY - minY + 1);
    }
}