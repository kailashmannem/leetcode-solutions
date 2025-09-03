class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        if h == len(piles): return max(piles)
        def assign(piles, low, high, h):
            ans = -1
            while low <= high:
                mid = low + (high - low)//2
                if valid(piles, mid, h):
                    ans = mid
                    high = mid - 1
                else:
                    low = mid + 1
            return ans
        def valid(piles, num, h):
            complete = 0
            for pile in piles:
                complete += math.ceil(pile/num)
            return complete <= h
        low, high = 1, max(piles)
        return assign(piles, low, high, h)