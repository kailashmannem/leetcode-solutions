class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        sum_num = 0
        d = {}
        for i in nums:
            if i in d.keys():
                d[i] += 1
            else:
                d[i] = 1
        for _,j in d.items():
            sum_num += j*(j-1)//2
        return sum_num