class Solution {
    public int minOperations(String[] logs) {
        var dir = new Stack<String>();
        for (String str : logs) {
            switch (str) {
                case "../" -> {
                    if (!dir.isEmpty()) {
                        dir.pop();
                    }
                }
                case "./" -> {}
                default -> dir.push(str);
            }
        }
        return dir.size();
    }
}