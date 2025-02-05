class Solution {
    public int reverse(int x) {
        return reverseHelper(x, 0);
    }

    private int reverseHelper(int x, int sum) {
        if (x == 0) {
            return sum;
        } else {
            sum = sum * 10 + x % 10;
            return reverseHelper(x / 10, sum);
        }
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x%10==0 && x!=0))
            return false;
        return x == reverse(x);
    }
}