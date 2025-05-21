class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m,n = len(matrix), len(matrix[0])
        row = set()
        col = set()
        for i in range(m):
            for j in range(n):
                if matrix[i][j]==0 and (i not in row or j not in col):
                    row.add(i)
                    col.add(j)
        for i in row:
            for k in range(n):
                matrix[i][k] = 0
        for j in col:
            for k in range(m):
                matrix[k][j] = 0