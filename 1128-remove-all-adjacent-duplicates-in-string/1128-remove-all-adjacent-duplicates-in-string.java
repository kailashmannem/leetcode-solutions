import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        var str = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (!str.isEmpty() && str.peek()==c) {
                str.pop();
            }
            else {
                str.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str) {
            sb.append(c);
        }
        return sb.toString();
    }
}