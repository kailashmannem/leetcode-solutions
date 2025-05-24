class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        d = Counter(arr)
        if len(set(d.values())) == len(d.values()):
            return True
        return False