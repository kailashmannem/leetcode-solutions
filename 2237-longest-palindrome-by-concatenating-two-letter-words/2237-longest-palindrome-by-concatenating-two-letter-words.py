class Solution:
    def longestPalindrome(self, words: List[str]) -> int:
        wd = Counter(words)
        count = 0
        used = False
        for s in words:
            rev = s[::-1]
            if s == rev:
                pair = wd[s]//2
                count += pair*4
                wd[s] -= pair*2
                if not used and wd[s] > 0:
                    count += 2
                    used = True
            elif s < rev and rev in wd:
                pair = min(wd[s],wd[rev])
                count += pair*4
                wd[s] -= pair
                wd[rev] -= pair
        return count