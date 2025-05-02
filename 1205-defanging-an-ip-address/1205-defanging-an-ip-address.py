class Solution:
    def defangIPaddr(self, address: str) -> str:
        l = address.split('.')
        return "[.]".join(l)
