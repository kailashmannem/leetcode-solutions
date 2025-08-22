class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        def count(items, ruleValue, idx):
            count = 0
            for i in range(len(items)):
                if items[i][idx] == ruleValue:
                    count += 1
            return count
        if ruleKey == "type":
            return count(items, ruleValue, 0)
        if ruleKey == "color":
            return count(items, ruleValue, 1)
        return count(items, ruleValue, 2)
            