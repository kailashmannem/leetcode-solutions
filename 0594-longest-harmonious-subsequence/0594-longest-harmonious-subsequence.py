class Solution:
    def findLHS(self, nums: List[int]) -> int:
        l = list(set(nums))
        l.sort()
        freq = Counter(nums)
        count = 0
        for i in range(len(l) - 1):
            if l[i] + 1 == l[i+1]:
                count = max(freq[l[i]] + freq[l[i+1]], count)
        return count