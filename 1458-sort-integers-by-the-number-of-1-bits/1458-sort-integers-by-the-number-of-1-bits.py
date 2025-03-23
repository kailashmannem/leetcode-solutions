class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        d = {}
        for num in arr:
            bc = bin(num).count('1')
            if bc not in d:
                d[bc] = SortedList()
            d[bc].add(num)
        res = []
        for key in sorted(d.keys()):
            res.extend(d[key])
        return res