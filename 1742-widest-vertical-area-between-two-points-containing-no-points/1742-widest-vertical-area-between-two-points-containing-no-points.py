class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        points.sort()
        count = -1
        for i in range(len(points)-1):
            p = points[i+1][0] - points[i][0]
            count = max(count,p)
        return count