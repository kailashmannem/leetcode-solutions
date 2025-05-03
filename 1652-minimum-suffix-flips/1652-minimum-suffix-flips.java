class Solution {
    public int minFlips(String target) {
        int count = 0;
        int current = 0;
        for (char c : target.toCharArray()) {
            if (c=='1' && current == 0) {
                current = 1;
                count++;
            }
            if (c=='0' && current == 1) {
                current = 0;
                count++;
            }
        }
        return count;
    }
}