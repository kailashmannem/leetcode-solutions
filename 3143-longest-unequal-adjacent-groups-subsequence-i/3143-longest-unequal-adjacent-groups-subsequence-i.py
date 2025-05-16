class Solution:
    def getLongestSubsequence(self, words: List[str], groups: List[int]) -> List[str]:
        indices = []
        i = 0
        j = 1
        while j < len(groups):
            if groups[i]!=groups[j]:
                indices.append(i)
                i = j
            j += 1
        indices.append(i)
        result = []
        for i in indices:
            result.append(words[i])
        return result