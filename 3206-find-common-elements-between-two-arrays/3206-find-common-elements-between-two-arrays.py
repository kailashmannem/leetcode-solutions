class Solution:
    def findIntersectionValues(self, nums1: List[int], nums2: List[int]) -> List[int]:
        freq1, freq2 = set(nums1), set(nums2)
        left, right = 0, 0
        for num in nums1:
            if num in freq2: left += 1
        for num in nums2:
            if num in freq1: right += 1
        return [left, right]