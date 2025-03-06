class Solution:
    def firstUniqChar(self, s: str) -> int:
        d = Counter(s)
        for i,j in d.items():
            if j==1:
                return s.index(i)
        return -1