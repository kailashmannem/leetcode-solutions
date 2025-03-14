class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        ds = {}
        dt = {}
        for i in range(len(s)):
            if s[i] in ds:
                if ds[s[i]] != t[i]:
                    return False
            else:
                 ds[s[i]] = t[i]
            if t[i] in dt:
                if dt[t[i]] != s[i]:
                    return False
            else:
                dt[t[i]] = s[i]
        return True