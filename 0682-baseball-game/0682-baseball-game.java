import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        var score = new Stack<Integer>();
        for (String str : operations) {
            switch (str) {
                case "C" -> score.pop();
                case "+" -> {
                    int first = score.pop();
                    int last = score.peek();
                    score.push(first);
                    score.push(first+last);
                }
                case "D" -> score.push(score.peek()*2);
                default -> score.push(Integer.parseInt(str));
            }
        }
        int sum = 0;
        while (!score.isEmpty()) {
            sum += score.pop();
        }
        return sum;
    }
}