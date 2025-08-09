class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        nums = set(nums)
        num = 1
        while True:
            if num not in nums:
                return num
            num += 1