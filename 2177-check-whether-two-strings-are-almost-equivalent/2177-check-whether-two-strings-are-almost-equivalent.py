class Solution:
    def checkAlmostEquivalent(self, word1: str, word2: str) -> bool:
        d1 = Counter(word1)
        d2 = Counter(word2)
        for k,v in d1.items():
            if k in set(d2.keys()):
                if abs(d1[k]-d2[k])>3:
                    return False
            else:
                if d1[k]>3:
                    return False
        for k,v in d2.items():
            if k not in set(d1.keys()):
                if d2[k]>3:
                    return False
        return True
