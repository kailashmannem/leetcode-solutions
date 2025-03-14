class Solution {
    public int maxDepth(String s) {
        int count = 0, max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            }
            else if (c == ')') {
                max = Math.max(count, max);
                count--;
            }
        }
        return max = Math.max(count, max);
    }
}