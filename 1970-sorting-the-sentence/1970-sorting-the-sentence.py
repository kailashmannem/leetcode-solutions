class Solution:
    def sortSentence(self, s: str) -> str:
        s = s.split()
        s = sorted(s, key = lambda word : int(word[-1]))
        return " ".join(word[:-1] for word in s)