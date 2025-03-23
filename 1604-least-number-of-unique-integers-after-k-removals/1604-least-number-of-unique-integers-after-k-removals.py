class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        if k==0:
            return len(set(arr))
        d = Counter(arr)
        arr = sorted(arr, key = lambda num : (-d[num],num))
        return len(set(arr[:-k]))