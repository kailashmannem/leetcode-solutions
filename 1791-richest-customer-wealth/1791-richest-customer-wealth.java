class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0, customer = 0;
        for (int i=0;i<accounts.length;i++) {
            for (int j=0;j<accounts[0].length;j++) {
                customer += accounts[i][j];
                if (max < customer) {
                    max = customer;
                }
            }
            customer = 0;
        }
        return max;
    }
}