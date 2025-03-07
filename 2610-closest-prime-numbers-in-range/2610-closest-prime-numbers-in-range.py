class Solution:
    def closestPrimes(self, left: int, right: int) -> List[int]:
        left = max(2, left)
        primes = self.segmentedSieve(left, right)
        if len(primes) < 2:
            return [-1, -1]
        min_diff = 1_000_000_000
        result = [-1, -1]
        for i in range(1, len(primes)):
            diff = primes[i] - primes[i-1]
            if diff < min_diff:
                min_diff = diff
                result = [primes[i-1], primes[i]]
        return result

    def segmentedSieve(self, left: int, right: int) -> List[int]:
        limit = math.isqrt(right)
        base_primes = self.sieve(limit)

        is_prime = [True] * (right - left + 1)
        if left == 1: 
            is_prime[0] = False

        for p in base_primes:
            start = max(p * p, (left + p - 1) // p * p)
            for i in range(start, right + 1, p):
                is_prime[i - left] = False

        primes = [i for i in range(left, right + 1) if is_prime[i - left]]
        return primes

    def sieve(self, limit: int) -> List[int]:
        is_prime = [True] * (limit + 1)
        is_prime[0] = is_prime[1] = False

        for p in range(2, limit + 1):
            if is_prime[p]:
                for multiple in range(p * p, limit + 1, p):
                    is_prime[multiple] = False

        return [p for p in range(2, limit + 1) if is_prime[p]]