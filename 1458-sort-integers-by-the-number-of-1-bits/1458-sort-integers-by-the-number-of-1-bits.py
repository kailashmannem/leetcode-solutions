class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        arr.sort()
        res = sorted(arr, key = lambda num : bin(num).count('1'))
        return res