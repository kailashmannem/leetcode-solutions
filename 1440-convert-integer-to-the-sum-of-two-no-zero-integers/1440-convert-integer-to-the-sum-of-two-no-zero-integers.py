class Solution:
    def getNoZeroIntegers(self, n: int) -> List[int]:
        def check_zero(num):
            return str(num).count('0') == 0
        for i in range(1, n + 1):
            if check_zero(i) and check_zero(n - i):
                return [i, n - i]
        return -1