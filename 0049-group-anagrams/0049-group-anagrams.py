class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        group = defaultdict(list)
        for s in strs:
            word = sorted(s)
            group["".join(word)].append(s)
        return list(group.values())