class Solution:
    def deleteGreatestValue(self, grid: List[List[int]]) -> int:
        ans = 0
        l = []
        for j in range(len(grid[0])):
            for i in grid:
                l.append(max(i))
                i.pop(i.index(max(i)))
            ans += max(l)
            l = []
        return ans