class Solution {
    public long coloredCells(int n) {
        long sum = (2*n-1)+2*((long)Math.pow(n-1,2));
        return sum;
    }
}