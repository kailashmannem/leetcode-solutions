class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        d = {}
        for i in nums:
            if i in d.keys():
                d[i] += 1
            else:
                d[i] = 1
        if all(i%2==0 for i in d.values()):
            return True
        return False