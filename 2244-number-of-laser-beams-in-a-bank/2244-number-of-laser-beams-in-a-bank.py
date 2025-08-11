class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        prev, total = -1, 0
        for i in range(len(bank)):
            beams = bank[i].count('1')
            if beams == 0:
                continue
            if prev == -1: 
                prev = beams
                continue
            total += beams*prev
            prev = beams
        return total