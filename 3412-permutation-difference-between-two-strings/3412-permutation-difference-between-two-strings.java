class Solution {
    public int findPermutationDifference(String s, String t) {
        int count = 0;
        for (int i=0; i<s.length(); i++)
            count += Math.abs(i - t.indexOf(s.charAt(i)));
        return count;
    }
}