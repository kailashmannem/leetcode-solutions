class Solution {
    public int minMoves(int target, int maxDoubles) {
        int steps = 0;
        while (target > 1) {
            while (target%2 == 0 && maxDoubles > 0) {
                steps += 1;
                target /= 2;
                maxDoubles -= 1;
            }
            if (target == 1) break;
            if (target > 1) {
                if (maxDoubles == 0) {
                    steps += target - 1;
                    break;
                }
                else {
                    steps += 1;
                    target -= 1;
                }
            }
        }
        return steps;
    }
}