class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        count = 0
        freq = Counter(nums)
        maxi = max(freq.values())
        for _, v in freq.items():
            count += v if v == maxi else 0
        return count