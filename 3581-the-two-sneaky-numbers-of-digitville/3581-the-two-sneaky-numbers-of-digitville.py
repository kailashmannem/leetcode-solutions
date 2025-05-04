class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        num1, num2 = -1, -1
        sneak = Counter(nums)
        for k, v in sneak.items():
            if v == 2:
                num2 = num1
                num1 = k
        return [num1, num2]
