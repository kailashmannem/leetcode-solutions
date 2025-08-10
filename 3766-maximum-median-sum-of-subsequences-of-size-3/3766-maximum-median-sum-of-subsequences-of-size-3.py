class Solution:
    def maximumMedianSum(self, nums: List[int]) -> int:
        nums.sort()
        total, n = 0, len(nums)
        for i in range(1, (n//3) + 1):
            total += nums[n - 2*i]
        return total