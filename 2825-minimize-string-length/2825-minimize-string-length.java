class Solution {
    public int minimizedStringLength(String s) {
        var hs = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            hs.add(c);
        }
        return hs.size();
    }
}