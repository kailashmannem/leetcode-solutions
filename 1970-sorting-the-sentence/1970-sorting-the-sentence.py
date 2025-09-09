class Solution:
    def sortSentence(self, s: str) -> str:
        s = s.split()
        res = [""]*len(s)
        for st in s:
            res[int(st[-1]) - 1] = st[:-1]
        return " ".join(res)