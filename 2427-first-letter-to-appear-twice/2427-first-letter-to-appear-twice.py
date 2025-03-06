class Solution:
    def repeatedCharacter(self, s: str) -> str:
        d = {}
        for i in s:
            if i in d.keys():
                return i
            else:
                d[i] = 1