class Solution:
    def closestPrimes(self, left: int, right: int) -> List[int]:
        if left > right:
            return [-1, -1]
        is_prime = [True] * (right + 1)
        is_prime[0] = is_prime[1] = False
        for i in range(2, math.isqrt(right) + 1):
            if is_prime[i]:
                for j in range(i * i, right + 1, i):
                    is_prime[j] = False
        primes = [i for i in range(left, right + 1) if is_prime[i]]
        if len(primes) < 2:
            return [-1, -1]
        min_diff, num1, num2 = 1_000_000_000, -1, -1
        for i in range(1, len(primes)):
            diff = primes[i] - primes[i - 1]
            if diff < min_diff:
                min_diff = diff
                num1, num2 = primes[i - 1], primes[i]
        return [num1, num2]