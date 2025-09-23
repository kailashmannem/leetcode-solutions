class Solution {
    public int largestAltitude(int[] gain) {
        int num = 0, max = 0;
        for (int alt : gain) {
            num += alt;
            max = Math.max(num, max);
        }
        return max;
    }
}