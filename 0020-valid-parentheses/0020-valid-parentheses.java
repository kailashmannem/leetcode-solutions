class Solution {
    public boolean isValid(String s) {
        var stack = new Stack<Character>();
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c=='('||c=='{'||c=='[') {
                stack.push(c);
            }
            else if (c==')'||c=='}'||c==']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char peek = stack.pop();
                if (peek=='(' && c!=')'||peek=='{' && c!='}'||peek=='[' && c!=']') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}