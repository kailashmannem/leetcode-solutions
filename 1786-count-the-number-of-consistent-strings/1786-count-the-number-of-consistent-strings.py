class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        allowed = set(allowed)
        count = 0
        for l in words:
            if set(l).issubset(allowed):
                count += 1
        return count