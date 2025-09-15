class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        count = 0
        bl = set(brokenLetters)
        for word in text.split():
            for ch in word:
                if ch in brokenLetters:
                    count += 1
                    break
        return len(text.split()) - count