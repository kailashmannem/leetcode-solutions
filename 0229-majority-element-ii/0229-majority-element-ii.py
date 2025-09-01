class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        freq = Counter(nums)
        res = []
        n = len(nums)
        for i,j in freq.items():
            if j > n//3:
                res.append(i)
        return res