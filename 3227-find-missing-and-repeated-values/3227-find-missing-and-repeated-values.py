class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        d = {}
        dup = 0
        for i in grid:
            for j in i:
                if j in d.keys():
                    d[j] += 1
                    if d[j]==2:
                        dup = j
                else:
                    d[j] = 1
        n = len(grid)**2
        n = (n*(n+1))//2
        return [dup,n-sum(d.keys())]