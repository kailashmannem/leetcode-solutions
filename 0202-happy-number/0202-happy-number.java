class Solution {
    public boolean isHappy(int n) {
        int slow = n; 
        int fast = n;
        do {
            slow = getSquares(slow);
            fast = getSquares(getSquares(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private int getSquares(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
}