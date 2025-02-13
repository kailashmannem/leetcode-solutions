class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x%10==0 && x!=0)) {
            return false;
        }
        return x==reverse(x)?true:false;
    }

    public int reverse(int n) {
        int sum = 0;
        while (n!=0) {
            sum = sum*10 + n%10;
            n /= 10;
        }
        return sum;
    }
}