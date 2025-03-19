class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length()==0) return true;
        if (t.length()==0) return false;
        int i = 0;
        for (char c : t.toCharArray()) {
            if (i<s.length() && c==s.charAt(i)) {
                i++;
            }
        }
        return i==s.length();
    }
}