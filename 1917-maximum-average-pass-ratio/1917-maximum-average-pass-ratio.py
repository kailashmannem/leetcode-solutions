class Solution:
    def maxAverageRatio(self, classes: List[List[int]], extraStudents: int) -> float:
        heap = []
        for p, t in classes:
            gain = (p + 1)/(t + 1) - p/t
            heapq.heappush(heap, (-gain, p, t))
        for _ in range(extraStudents):
            e, p, t = heapq.heappop(heap)
            p += 1
            t += 1
            gain = (p + 1)/(t + 1) - p/t
            heapq.heappush(heap, (-gain, p, t))
        total = 0
        while heap:
            _, p, t = heapq.heappop(heap)
            total += p/t
        total /= len(classes)
        return total