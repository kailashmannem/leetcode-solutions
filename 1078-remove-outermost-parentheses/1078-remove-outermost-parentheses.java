class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') count += 1;
            else {
                count -= 1;
                if (count == 1) sb.append(ch);
            }
            if (count > 1) sb.append(ch);
        }
        return sb.toString();
    }
}