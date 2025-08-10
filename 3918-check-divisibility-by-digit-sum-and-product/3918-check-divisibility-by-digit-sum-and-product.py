class Solution:
    def checkDivisibility(self, n: int) -> bool:
        def func(n):
            add, prod = 0, 1
            while n!=0:
                add += (n%10)
                prod *= (n%10)
                n //= 10
            return add + prod
        return n%func(n)==0