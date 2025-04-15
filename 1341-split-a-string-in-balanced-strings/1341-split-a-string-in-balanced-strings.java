class Solution {
    public int balancedStringSplit(String s) {
        int left = 0, right = 0, count = 0;
        for (char c : s.toCharArray()) {
            if (c=='L') {
                left++;
            }
            if (c=='R') {
                right++;
            }
            if (left==right) {
                count += 1;
                left = right = 0;
            }
        }
        return count;
    }
}