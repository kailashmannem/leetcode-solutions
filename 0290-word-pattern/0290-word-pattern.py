class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if len(pattern)!=len(s.split()):
            return False
        pattern = list(pattern)
        s = list(s.split())
        dpattern = {}
        ds = {}
        for i in range(len(s)):
            if pattern[i] in dpattern:
                if dpattern[pattern[i]] != s[i]:
                    return False
            else:
                 dpattern[pattern[i]] = s[i]
            if s[i] in ds:
                if ds[s[i]] != pattern[i]:
                    return False
            else:
                ds[s[i]] = pattern[i]
        return True