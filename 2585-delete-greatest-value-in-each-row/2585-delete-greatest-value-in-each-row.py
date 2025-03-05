class Solution:
    def deleteGreatestValue(self, grid: List[List[int]]) -> int:
        ans = 0
        for i in grid:
            i.sort()
        l = []
        for j in range(len(grid[0])-1,-1,-1):
            for i in range(len(grid)):
                l.append(grid[i][j])
            ans += max(l)
            l = []
        return ans