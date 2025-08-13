class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        total, add = sum(nums), 0
        for num in nums:
            while num != 0:
                add += num%10
                num //= 10
        return abs(total - add)