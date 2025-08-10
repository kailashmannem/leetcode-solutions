class Solution:
    def validateCoupons(self, code: List[str], businessLine: List[str], isActive: List[bool]) -> List[str]:
        items = []
        for i in range(len(businessLine)):
            items.append((businessLine[i], code[i], isActive[i]))
        items.sort()
        res = []
        for business, code, active in items:
            if not active:
                continue
            if not re.fullmatch(r'[a-zA-Z0-9_]+', code):
                continue
            if business not in ["electronics", "grocery", "pharmacy", "restaurant"]:
                continue
            res.append(code)
        return res