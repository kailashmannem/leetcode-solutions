class Solution {
    public int minPartitions(String n) {
        //Maximum number of the string because we need n number of 1's to continuously add to make up to that number.
        int max = 0;
        for (int i = 0; i<n.length(); i++) {
            max = Math.max(max, n.charAt(i) - '0');
        }
        return max;
    }
}