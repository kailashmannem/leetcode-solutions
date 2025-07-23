class Solution:
    def maximumGain(self, s: str, x: int, y: int) -> int:
        def subRemoval(s, t1, t2):
            stack = deque()
            count = 0
            for ch in s:
                if stack and stack[-1] == t1 and ch == t2:
                    stack.pop()
                    count += 1
                    continue
                stack.append(ch)
            return count, "".join(stack)
        if x >= y:
            val1, s = subRemoval(s, "a", "b")
            val2, _ = subRemoval(s, "b", "a")
            return val1*x + val2*y
        else:
            val1, s = subRemoval(s, "b", "a")
            val2, _ = subRemoval(s, "a", "b")
            return val1*y + val2*x