class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n!=0) {
            int res = n%10;
            product *= res;
            sum += res;
            n /= 10;
        }
        return product - sum;
    }
}