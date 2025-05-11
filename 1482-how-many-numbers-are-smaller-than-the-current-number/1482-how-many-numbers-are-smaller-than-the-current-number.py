class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        arr = sorted(nums)
        res = [0]*len(nums)
        for i in range(len(nums)):
            res[i] = arr.index(nums[i])
        return res