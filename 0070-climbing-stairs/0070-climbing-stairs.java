class Solution {
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        int first = 1, second = 2;
        int next = first + second;
        for (int i=3;i<n;i++) {
            first = second;
            second = next;
            next = first + second;
        }
        return next;
    }
}