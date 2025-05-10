class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        group = {}
        for i in range(len(groupSizes)):
            x = groupSizes[i]
            if x in group.keys():
                group[x].append(i)
            else:
                group[x] = [i]
        result = []
        for k,v in group.items():
            for i in range(0,len(v),k):
                result.append(v[i:i+k])
        return result