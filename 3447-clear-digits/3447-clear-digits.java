import java.util.*;
class Solution {
    public String clearDigits(String s) {
        var stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.pop();
            }
            else {
                stack.push(c);
            }
        }
        var sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}