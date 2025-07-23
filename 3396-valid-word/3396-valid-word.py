class Solution:
    def isValid(self, word: str) -> bool:
        if len(word) < 3:
            return False
        if re.search(r'[!@#$%^&*()_+\-=\[\]{}|;:\'",./<>?~`]', word):
            return False
        if not re.search(r'[aeiou]', word, re.IGNORECASE):
            return False
        if not re.search(r"[bcdfghjklmnpqrstvwxyz]", word, re.IGNORECASE):
            return False
        return True