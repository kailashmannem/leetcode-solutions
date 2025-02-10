class Solution {
    public String finalString(String s) {
        var sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c=='i') {
                sb.reverse();
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}