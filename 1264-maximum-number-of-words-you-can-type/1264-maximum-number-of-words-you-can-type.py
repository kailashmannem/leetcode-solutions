class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        count = 0
        broken = [0]*26
        for ch in brokenLetters:
            broken[ord(ch) - ord('a')] += 1
        for word in text.split():
            flag = False
            for ch in word:
                if broken[ord(ch) - ord('a')] != 0:
                    flag = True
                    break
            count += 0 if flag else 1  
        return count