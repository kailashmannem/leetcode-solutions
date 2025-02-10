class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int ballsToLeft = 0;
        int ballsToRight = 0;
        int movesToLeft = 0;
        int movesToRight = 0;
        int[] result = new int[n];
        if (n == 1) {
            return new int[] { 0 };
        }
        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
            result[i] += movesToLeft;
            ballsToLeft += Character.getNumericValue(boxes.charAt(i));
            movesToLeft += ballsToLeft;
            result[j] += movesToRight;
            ballsToRight += Character.getNumericValue(boxes.charAt(j));
            movesToRight += ballsToRight;
        }
        return result;
    }
}