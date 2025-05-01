class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        pos = []
        neg = []
        for num in nums:
            if num>0:
                pos.append(num)
            else:
                neg.append(num)
        k = 0
        for i in range(len(pos)):
            nums[k] = pos[i]
            nums[k+1] = neg[i]
            k += 2
        return nums