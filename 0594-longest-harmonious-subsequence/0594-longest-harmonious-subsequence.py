class Solution:
    def findLHS(self, nums: List[int]) -> int:
        nums.sort()
        freq = Counter(nums)
        count = 0
        for i in freq:
            if i+1 in freq:
                count = max(freq[i]+freq[i+1],count)
        return count