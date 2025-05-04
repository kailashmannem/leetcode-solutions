class Solution:
    def convertDateToBinary(self, date: str) -> str:
        date = date.split("-")
        for i in range(3):
            date[i] = self.intToBin(int(date[i]))
        return "-".join(date)

    def intToBin(self, date: int) -> str:
        if date == 0: return "0"
        binary = ""
        while date!=0:
            binary = str(date % 2) + binary
            date //= 2
        return binary