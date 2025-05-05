class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == '(') {
                if (command.charAt(i+1) == ')') {
                    sb.append("o");
                    i += 2;
                    continue;
                }
                else {
                    sb.append("al");
                    i += 4;
                    continue;
                }
            }
            sb.append("G");
            i++;
        }
        return sb.toString();
    }
}