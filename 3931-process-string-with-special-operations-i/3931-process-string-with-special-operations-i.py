class Solution:
    def processStr(self, s: str) -> str:
        res = ""
        for i in range(len(s)):
            if s[i] == '#':
                res += res
            elif s[i] == '%':
                res = res[::-1]
            elif s[i] == '*':
                if res != "":
                    res = res[:-1]
            else:
                res += s[i]
        return res