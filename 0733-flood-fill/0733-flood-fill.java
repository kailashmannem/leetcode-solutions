class Solution {
    private void dfs(int[][] image, int row, int column, int old_color, int new_color) {
        if (row >= image.length || row < 0 || column >= image[0].length || column < 0 || image[row][column] != old_color) return;
        image[row][column] = new_color;
        dfs(image, row + 1, column, old_color, new_color);
        dfs(image, row - 1, column, old_color, new_color);
        dfs(image, row, column - 1, old_color, new_color);
        dfs(image, row, column + 1, old_color, new_color);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }
}