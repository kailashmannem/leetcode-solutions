class Solution:
    def perfectPairs(self, nums: List[int]) -> int:
        ans, j, n = 0, 0, len(nums)
        arr = sorted(abs(x) for x in nums)
        for i in range(n):
            if j < i + 1:
                j = i + 1
            while j < n and arr[j] <= 2*arr[i]:
                j += 1
            ans += (j - i - 1)
        return ans