class Solution {
    public boolean digitCount(String num) {
        int[] count = new int[10];
        for (int i = 0; i < num.length(); i++) {
            int idx = num.charAt(i) - '0';
            count[idx] += 1;
        }
        for (int i = 0; i < num.length(); i++) {
            int idx = num.charAt(i) - '0';
            if (count[i] != idx) return false;
        }
        return true;
    }
}