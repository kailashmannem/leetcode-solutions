class Router:
    def __init__(self, memoryLimit: int):
        self.route = deque()
        self.capacity = memoryLimit
        self.d = defaultdict(list)
        self.route_set = set()

    def addPacket(self, source: int, destination: int, timestamp: int) -> bool:
        if (source, destination, timestamp) in self.route_set:
            return False
        if len(self.route) == self.capacity:
            self.route_set.remove(tuple(self.route[0]))
            dest = self.route[0][1]
            self.route.popleft()
            self.d[dest].pop(0)
        self.route.append([source, destination, timestamp])
        self.route_set.add((source, destination, timestamp))
        self.d[destination].append(timestamp)
        return True

    def forwardPacket(self) -> List[int]:
        if not self.route:
            return []
        self.route_set.remove(tuple(self.route[0]))
        dest = self.route[0][1]
        self.d[dest].pop(0)
        return self.route.popleft()

    def getCount(self, destination: int, startTime: int, endTime: int) -> int:
        timestamp = self.d[destination]
        return bisect_right(timestamp,endTime) - bisect_left(timestamp,startTime)

# Your Router object will be instantiated and called as such:
# obj = Router(memoryLimit)
# param_1 = obj.addPacket(source,destination,timestamp)
# param_2 = obj.forwardPacket()
# param_3 = obj.getCount(destination,startTime,endTime)