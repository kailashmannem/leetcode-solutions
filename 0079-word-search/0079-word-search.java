class Solution {
    private boolean check_word(char[][] board, String word, int[][] directions, boolean[][] visited, int x, int y, int idx, int m, int n) {
        if (idx == word.length()) return true;
        for (int[] direction : directions) {
            int nx = x + direction[0], ny = y + direction[1];
            if (nx >= 0 && ny >= 0 && nx < m && ny < n && !visited[nx][ny] && board[nx][ny] == word.charAt(idx)) {
                visited[nx][ny] = true;
                if (check_word(board, word, directions, visited, nx, ny, idx + 1, m, n)) return true;
                visited[nx][ny] = false;
            }
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        int[][] directions = new int[][]{{1,0}, {-1,0}, {0,1}, {0,-1}};
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    visited[i][j] = true;
                    if (check_word(board, word, directions, visited, i, j, 1, m, n)) return true;
                    visited[i][j] = false;
                }
            }
        }
        return false;
    }
}