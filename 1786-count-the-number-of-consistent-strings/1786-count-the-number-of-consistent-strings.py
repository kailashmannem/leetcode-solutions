class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        count = 0
        allowed = set(allowed)
        for l in words:
            if set(l) <= allowed:
                count += 1
        return count