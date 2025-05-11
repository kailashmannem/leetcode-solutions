class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer> shm = new HashMap<Character,Integer>();
        Map<Character,Integer> thm = new HashMap<Character,Integer>();
        for (int i=0;i<s.length();i++) {
            shm.put(s.charAt(i),i);
            thm.put(t.charAt(i),i);
        }
        int count = 0;
        for (char c : s.toCharArray()) {
            count += Math.abs(shm.get(c)-thm.get(c));
        }
        return count;
    }
}