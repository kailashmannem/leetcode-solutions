class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        res = []
        if len(nums) == len(set(nums)):
            return [nums]
        d = Counter(nums)
        while True:
            l = []
            for k in d:
                if d[k] == 0:
                    continue
                l.append(k)
                d[k] -= 1
            if not l:
                break
            res.append(l)
        return res