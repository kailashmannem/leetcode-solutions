class Solution {
    public int minPartitions(String n) {
        //Maximum number of the string because we need n number of 1's to continuously add to make up to that number.
        int max = 0;
        for (char c : n.toCharArray()) {
            int val = c - '0';
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
}