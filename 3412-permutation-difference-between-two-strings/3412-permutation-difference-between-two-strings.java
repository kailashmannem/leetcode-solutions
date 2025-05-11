class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer> thm = new HashMap<Character,Integer>();
        for (int i=0;i<t.length();i++) {
            thm.put(t.charAt(i),i);
        }
        int count = 0, i = 0;
        for (char c : s.toCharArray()) {
            count += Math.abs(i-thm.get(c));
            i += 1;
        }
        return count;
    }
}