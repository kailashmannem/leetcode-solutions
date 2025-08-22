class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateAll(result, n, n, "");
        return result;
    }

    public void generateAll(List<String> res, int open, int close, String str) {
        if (open == 0 && close == 0) {
            res.add(str);
        }
        if (open > 0) {
            generateAll(res, open - 1, close, str + '(');
        }
        if (close > open) {
            generateAll(res, open, close - 1, str + ')');
        }
    }
}