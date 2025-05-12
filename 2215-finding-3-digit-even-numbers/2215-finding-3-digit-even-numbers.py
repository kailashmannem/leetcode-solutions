class Solution:
    def findEvenNumbers(self, digits: List[int]) -> List[int]:
        res = []
        digits_counter = Counter(digits)
        for num in range(100,1000,2):
            nums = [int(i) for i in str(num)]
            if Counter(nums) <= digits_counter:
                res.append(num)
        return res