class Solution:
    def transformArray(self, nums: List[int]) -> List[int]:
        even, odd = 0, 0
        for num in nums:
            if num%2 == 0:
                even += 1
            else:
                odd += 1
        return [0]*even + [1]*odd