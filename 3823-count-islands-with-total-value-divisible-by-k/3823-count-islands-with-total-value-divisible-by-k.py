class Solution:
    def countIslands(self, grid: List[List[int]], k: int) -> int:
        m,n = len(grid), len(grid[0])
        visited = [[False]*n for _ in range(m)]
        directions = [(0,1),(0,-1),(-1,0),(1,0)]
        count = 0
        
        def bfs(r, c):
            queue = deque()
            queue.append((r,c))
            visited[r][c] = True
            total = grid[r][c]

            while queue:
                x,y = queue.popleft()
                for dx, dy in directions:
                    nx, ny = x + dx, y + dy
                    if 0 <= nx < m and 0 <= ny < n and grid[nx][ny] > 0 and not visited[nx][ny]:
                        visited[nx][ny] = True
                        total += grid[nx][ny]
                        queue.append((nx, ny))
            return total
            
        for i in range(m):
            for j in range(n):
                if grid[i][j] > 0 and not visited[i][j]:
                    if bfs(i, j)%k==0:
                        count += 1
        return count