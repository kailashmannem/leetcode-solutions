class Solution:
    def numEquivDominoPairs(self, dominoes: List[List[int]]) -> int:
        domi = Counter(tuple(sorted(l)) for l in dominoes)
        # for l in dominoes:
        #     t = tuple(sorted(l))
        #     if t in domi.keys():
        #         domi[t] += 1
        #     else:
        #         domi[t] = 1
        count = 0
        for v in domi.values():
            count += (v*(v-1)//2)
        return count