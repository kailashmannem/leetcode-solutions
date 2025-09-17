class FoodRatings:
    def __init__(self, foods: List[str], cuisines: List[str], ratings: List[int]):
        self.menu, self.heap = {}, defaultdict(list)
        for food, cuisine, rating in zip(foods, cuisines, ratings):
            self.menu[food] = [cuisine, rating]
            heapq.heappush(self.heap[cuisine], (-rating, food))

    def changeRating(self, food: str, newRating: int) -> None:
        cuisine = self.menu[food][0]
        self.menu[food][1] = newRating
        heapq.heappush(self.heap[cuisine], (-newRating, food))

    def highestRated(self, cuisine: str) -> str:
        highrated = self.heap[cuisine]
        while highrated:
            rating, food = highrated[0]
            if -rating == self.menu[food][1]: return food
            heapq.heappop(highrated)


# Your FoodRatings object will be instantiated and called as such:
# obj = FoodRatings(foods, cuisines, ratings)
# obj.changeRating(food,newRating)
# param_2 = obj.highestRated(cuisine)