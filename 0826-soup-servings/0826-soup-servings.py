class Solution:
    def soupServings(self, n: int) -> float:
        def soup(a, b, dp):
            if (a,b) in dp: return dp[(a,b)]
            if a <= 0 and b <= 0: return 0.5
            if a <= 0: return 1
            if b <= 0: return 0
            dp[(a,b)] = 0.25*(soup(a - 100, b, dp) + soup(a - 75, b - 25, dp) + soup(a - 50, b - 50, dp) + soup(a - 25, b - 75, dp))
            return dp[(a,b)]
        if n > 4800: return 1
        dp = {}
        return soup(n, n, dp)