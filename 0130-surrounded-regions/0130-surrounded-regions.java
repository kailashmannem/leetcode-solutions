class Solution {
    private int m, n;
    public void solve(char[][] board) {
        m = board.length; n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    if (board[i][j] == 'O' && !visited[i][j]) {
                        dfs(i, j, board, visited);
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) board[i][j] = 'X';
            }
        }
    }
    private void dfs(int x, int y, char[][] board, boolean[][] visited) {
        if (x < 0 || y < 0 || x >= m || y >= n || board[x][y] == 'X' || visited[x][y]) return;
        visited[x][y] = true;
        dfs(x + 1, y, board, visited);
        dfs(x - 1, y, board, visited);
        dfs(x, y + 1, board, visited);
        dfs(x, y - 1, board, visited);
    }
}