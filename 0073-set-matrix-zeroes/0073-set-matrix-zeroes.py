class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
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
        # for i in row:
        #     for k in range(n):
        #         matrix[i][k] = 0
        # for j in col:
        #     for k in range(m):
        #         matrix[k][j] = 0