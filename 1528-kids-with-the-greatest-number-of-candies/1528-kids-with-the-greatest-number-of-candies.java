class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int maximum = -1;
        for (int i = 0; i < candies.length; i++) {
            maximum = Math.max(candies[i], maximum);
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies < maximum) {
                result.add(false);
            }
            else {
                result.add(true);
            }
        }
        return result;
    }
}