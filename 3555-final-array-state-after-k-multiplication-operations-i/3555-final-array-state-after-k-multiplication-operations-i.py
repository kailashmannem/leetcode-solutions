class Solution:
    def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:
        while k > 0:
            i = nums.index(min(nums))
            nums[i] = nums[i]*multiplier
            k -= 1
        return nums