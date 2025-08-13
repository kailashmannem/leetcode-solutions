class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        def digitSum(num):
            add = 0
            while num != 0:
                add += num%10
                num //= 10
            return add
        digit = sum([digitSum(num) for num in nums])
        return abs(sum(nums) - digit)