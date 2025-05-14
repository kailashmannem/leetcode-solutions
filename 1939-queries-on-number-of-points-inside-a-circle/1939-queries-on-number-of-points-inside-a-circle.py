class Solution:
    def countPoints(self, points: List[List[int]], queries: List[List[int]]) -> List[int]:
        res = []
        for l in queries:
            count = 0
            for p in points:
                if (p[0] - l[0])**2 + (p[1] - l[1])**2 <= l[2]**2:
                    count += 1
            res.append(count)
        return res