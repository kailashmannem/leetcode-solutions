class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        count = 0
        view = [0] * (len(A) + 1)
        res = [0]*(len(A))
        for i in range(len(A)):
            if view[A[i]] == 0:
                view[A[i]] = 1
            elif view[A[i]] == 1:
                count += 1
            if view[B[i]] == 0:
                view[B[i]] = 1
            elif view[B[i]] == 1:
                count += 1
            res[i] = count
        return res