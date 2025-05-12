class Solution:
    def findEvenNumbers(self, digits: List[int]) -> List[int]:
        res = []
        for num in range(100,1000,2):
            l = digits.copy()
            n = num
            flag = True
            while n!=0:
                r = n%10
                if r in l:
                    l.remove(r)
                else:
                    flag = False
                    break
                n //= 10
            if flag:
                res.append(num)
        return res