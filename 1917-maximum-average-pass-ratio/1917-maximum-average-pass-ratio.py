class Solution:
    def maxAverageRatio(self, classes: List[List[int]], extraStudents: int) -> float:
        heap = []
        # Store in max_heap to get maximum difference in adding student
        for p, t in classes:
            gain = (p + 1)/(t + 1) - p/t
            heapq.heappush(heap, (-gain, p, t))
        # Now to progressively add the difference and add back to heap
        for _ in range(extraStudents):
            e, p, t = heapq.heappop(heap)
            p += 1
            t += 1
            gain = (p + 1)/(t + 1) - p/t
            heapq.heappush(heap, (-gain, p, t))
        # calculate the value
        total = 0
        for _, p, t in heap:
            total += p/t
        total /= len(classes)
        return total