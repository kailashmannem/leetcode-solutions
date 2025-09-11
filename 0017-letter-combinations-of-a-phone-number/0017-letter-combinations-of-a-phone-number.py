class Solution:
    phone = [
            [],
            [], 
            ["a", "b", "c"],
            ["d", "e", "f"],
            ["g", "h", "i"],
            ["j", "k", "l"],
            ["m", "n", "o"],
            ["p", "q", "r", "s"],
            ["t", "u", "v"],
            ["w", "x", "y", "z"]
        ]

    def letterCombinations(self, digits: str) -> List[str]:
        if not digits: return []
        if len(digits) == 1: return Solution.phone[int(digits)]
        ans = []
        self.backtrack(0, digits, ans, "")
        return ans

    def backtrack(self, idx, digits, res, store):
        if idx == len(digits):
            res.append(store)
            return
        num = int(digits[idx])
        for ch in Solution.phone[num]:
            self.backtrack(idx + 1, digits, res, store + ch)