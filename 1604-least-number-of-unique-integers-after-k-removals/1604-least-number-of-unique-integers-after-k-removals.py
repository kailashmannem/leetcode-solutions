class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        d = Counter(arr)
        res = list(d.values())
        res.sort(reverse = True)
        while k!=0:
            if res[-1] <= k:
                k -= res[-1]
                res.pop()
            else:
                k = 0
        return len(res)