class Solution:
    def reverseVowels(self, s: str) -> str:
        s = list(s)
        vowels = set("aeiouAEIOU")
        i = 0
        j = len(s) - 1
        while i<=j:
            if s[i] in vowels and s[j] in vowels:
                temp = s[i]
                s[i] = s[j]
                s[j] = temp
                i += 1
                j -= 1
                continue
            if s[i] not in vowels:
                i += 1
            if s[j] not in vowels:
                j -= 1
        return "".join(s)