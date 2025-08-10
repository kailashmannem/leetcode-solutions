class Solution:
    def splitArray(self, nums: List[int]) -> int:
        prime = [False, False] + [True]*(len(nums)-2)
        for i in range(2, int(len(nums)**0.5 + 1)):
            if prime[i]:
                for j in range(i*i,len(nums),i):
                    prime[j] = False
        psum, npsum = 0,0
        for i in range(len(nums)):
            if prime[i]:
                psum += nums[i]
            else:
                npsum += nums[i]
        return abs(psum - npsum)