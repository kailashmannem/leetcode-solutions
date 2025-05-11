class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        arr = sorted(nums)
        d = {}
        for i in range(len(arr)):
            if arr[i] not in d.keys():
                d[arr[i]] = i
        res = [0]*len(nums)
        for i in range(len(nums)):
            res[i] = d[nums[i]]
        return res