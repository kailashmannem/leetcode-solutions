class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1]!=9) {
            digits[digits.length-1] += 1;
            return digits;
        }
        int i = digits.length-1;
        while (i>=0) {
            digits[i] = 0;
            if (i-1>=0) {
                if (digits[i-1]!=9) {
                    digits[i-1] += 1;
                    return digits;
                }
            }
            else {
                int[] arr = new int[digits.length+1];
                arr[0] = 1;
                return arr;
            }
            i--;
        }
        return digits;
    }
}