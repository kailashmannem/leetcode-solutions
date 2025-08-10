class Solution:
    def processStr(self, s: str, k: int) -> str:
        length = 0
        #Forward pass
        for i in range(len(s)):
            if s[i] == '#':
                length *= 2
            elif s[i] == '*':
                if length > 0:
                    length -= 1
            elif s[i] == '%':
                pass
            else:
                length += 1
        if k >= length:
            return '.'
        #Backward pass
        for i in range(len(s) - 1,-1,-1):
            if s[i] == '*':
                length += 1
            elif s[i] == '#':
                length //= 2
                if k >= length:
                    k -= length
            elif s[i] == '%':
                k = length - k - 1
            else:
                if k == length - 1:
                    return s[i]
                length -= 1
        return '.'