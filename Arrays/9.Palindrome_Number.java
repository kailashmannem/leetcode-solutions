class Solution {
    public boolean isPalindrome(int x) {
        //Check basic conditions
        if (x < 0 || (x%10==0 && x!=0)) {
            return false;
        }
        int y = x, sum = 0;
        //While loop and changes to get reverse of a number
        while (x != 0) {
            sum = sum * 10 + x % 10;
            x /= 10;   
        }
        //Condition check and return statement
        if (y==sum) {
            return true;
        }
        return false;
    }
}
