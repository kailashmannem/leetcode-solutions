class Solution:
    def sortVowels(self, s: str) -> str:
        vowels = set("aeiouAEIOU")
        s = list(s)
        ranks = []
        for i in range(len(s)):
            if s[i] in vowels:
                ranks.append(ord(s[i]))
                s[i] = " "
        if not ranks:
            return "".join(s)
        ranks.sort()
        i = 0
        for j in range(len(s)):
            if s[j] == " ":
                s[j] = chr(ranks[i])
                i += 1
        return "".join(s)