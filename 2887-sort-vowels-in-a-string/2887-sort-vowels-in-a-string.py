class Solution:
    def sortVowels(self, s: str) -> str:
        vowels = set("aeiouAEIOU")
        ranks = []
        for ch in s:
            if ch in vowels:
                ranks.append(ch)
        ranks.sort()
        res, i = "", 0
        for ch in s:
            if ch in vowels:
                res += ranks[i]
                i += 1
            else:
                res += ch
        return res