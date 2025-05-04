class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int max = -1;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) max = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies < max) {
                result.add(false);
            }
            else {
                result.add(true);
            }
        }
        return result;
    }
}