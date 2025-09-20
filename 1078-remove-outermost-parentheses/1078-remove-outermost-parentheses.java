class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') stack.push(ch);
            else {
                stack.pop();
                if (stack.size() == 1) sb.append(ch);
            }
            if (stack.size() > 1) sb.append(ch);
        }
        return sb.toString();
    }
}