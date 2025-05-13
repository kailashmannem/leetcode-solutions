class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        da,db = {},{}
        for i in range(len(A)):
            if A[i] not in da:
                da[A[i]] = i
            if B[i] not in db:
                db[B[i]] = i
        res = [0]*len(A)
        for i in range(len(A)):
            count = 0
            for j in range(i+1):
                if da[A[j]] <= i and db[A[j]] <= i:
                    count += 1
            res[i] = count
        return res