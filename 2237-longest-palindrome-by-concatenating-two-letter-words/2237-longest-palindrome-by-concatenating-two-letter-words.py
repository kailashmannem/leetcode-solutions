class Solution:
    def longestPalindrome(self, words: List[str]) -> int:
        wd = Counter(words)
        count = 0
        used = False
        for word in wd.keys():
            rev = word[::-1]
            if word == rev:
                count += (wd[word]//2)*4
                if wd[word]%2 == 1:
                    used = True
            elif word < rev:
                count += 4*min(wd[word],wd[rev])
        return count + 2 if used else count