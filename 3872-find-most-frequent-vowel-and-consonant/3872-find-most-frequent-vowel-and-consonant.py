class Solution:
    def maxFreqSum(self, s: str) -> int:
        freq = defaultdict(int)
        for ch in s:
            freq[ch] += 1
        vowels = set("aeiou")
        max_vowel, max_consonent = 0, 0
        for ch, val in freq.items():
            if ch in vowels:
                max_vowel = max(max_vowel, val)
            else:
                max_consonent = max(max_consonent, val)
        return max_vowel + max_consonent