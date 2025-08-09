class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> seen = new HashMap<>();
        int max = Integer.MIN_VALUE, l = 0, r = 0;
        while (r < fruits.length) {
            seen.put(fruits[r], seen.getOrDefault(fruits[r], 0) + 1);
            if (seen.size() > 2) {
                while (seen.size() > 2) {
                    int fruit = fruits[l];
                    seen.put(fruit, seen.get(fruit) - 1);
                    if (seen.get(fruit) == 0) seen.remove(fruit);
                    l += 1;
                }
            }
            max = Math.max(max, r - l + 1);
            r += 1;
        }
        return max;
    }
}