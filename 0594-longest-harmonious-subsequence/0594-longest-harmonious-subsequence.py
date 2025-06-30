class Solution:
    def findLHS(self, nums: List[int]) -> int:
        l = list(set(nums))
        l.sort()
        freq = Counter(nums)
        count = 0
        for i in range(len(l) - 1):
            if l[i] + 1 == l[i+1]:
                curr = freq[l[i]] + freq[l[i+1]]
                if curr > count:
                    count = curr
        return count