class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        count = 0
        for l in words:
            present = True
            for i in l:
                if i not in allowed:
                    present = False
                    break
            if present: count += 1
        return count