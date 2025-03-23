class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        d = {}
        for num in arr:
            bc = self.bitsCount(num)
            if bc not in d:
                d[bc] = SortedList()
            d[bc].add(num)
        res = []
        for key in sorted(d.keys()):
            res.extend(d[key])
        return res

    def bitsCount(self, n: int) -> int:
        count = 0
        while n:
            n &= (n - 1)
            count += 1
        return count
