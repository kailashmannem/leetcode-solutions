class Solution:
    def convertDateToBinary(self, date: str) -> str:
        date = date.split("-")
        for i in range(3):
            date[i] = self.intToBin(int(date[i]))
        return "-".join(date)

    def intToBin(self, date: int) -> str:
        num = 0
        i = 1
        while date!=0:
            num += (date%2)*i
            date //= 2
            i *= 10
        return str(num)