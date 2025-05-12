class Solution:
    def totalNumbers(self, digits: List[int]) -> int:
        p = list(set(itertools.permutations(digits,3)))
        count = 0
        for i in p:
            if i[0]!=0 and i[2]%2==0:
                count += 1
        return count