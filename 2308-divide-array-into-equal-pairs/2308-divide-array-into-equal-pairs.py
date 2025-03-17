class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        d = collections.Counter(nums)
        for i in d.values():
            if i%2!=0:
                return False
        return True