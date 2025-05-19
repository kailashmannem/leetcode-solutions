class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        res = []
        i = 1
        while i < len(nums):
            res.extend([nums[i]]*nums[i-1])
            i += 2
        return res