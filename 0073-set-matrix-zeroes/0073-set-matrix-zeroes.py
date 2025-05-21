class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        m,n = len(matrix), len(matrix[0])
        zero = set()
        for i in range(m):
            for j in range(n):
                if matrix[i][j]==0:
                    zero.add((i,j))
        for r,c in zero:
            matrix[r] = [0] * n
            for row in matrix:
                row[c] = 0