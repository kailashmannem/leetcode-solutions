import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        var score = new LinkedList<Integer>();
        for (String str : operations) {
            switch (str) {
                case "C" -> score.remove(score.size() - 1);
                case "D" -> score.add(score.get(score.size() - 1) * 2);
                case "+" -> score.add(score.get(score.size() - 1) + score.get(score.size() - 2));
                default -> score.add(Integer.parseInt(str));
            }
        }
        int sum = 0;
        for (Integer value : score) {
            sum += value;
        }
        return sum;
    }
}