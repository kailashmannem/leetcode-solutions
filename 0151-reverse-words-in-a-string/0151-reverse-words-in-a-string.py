class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.split()
        for i in s:
            i.strip()
        return " ".join(s[::-1])
