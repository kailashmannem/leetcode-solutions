class Solution {
    public boolean checkRecord(String s) {
        int abs = 0, late = 1;
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c=='A') abs++;
            if (abs>=2) return false;
            if (i!=s.length()-1 && c==s.charAt(i+1) && c=='L') {
                late++;
            }
            else {
                late = 1;
            }
            if (late>=3) return false;
        }
        return true;
    }
}