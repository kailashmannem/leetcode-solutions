class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        if not g or not s:
            return 0
        g.sort()
        s.sort()
        j = 0
        for i in range(len(s)):
            if s[i] >= g[j]:
                j += 1
            if j >= len(g):
                return j
        return j