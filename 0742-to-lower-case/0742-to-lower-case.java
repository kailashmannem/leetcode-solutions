class Solution {
    public String toLowerCase(String s) {
        char[] str = s.toCharArray();
        for (int i=0;i<str.length;i++) {
            if (65 <= (int)str[i] && (int)str[i] <= 90) {
                str[i] = (char) ((int) (str[i]) + 32);
            }
        }
        return new String(str);
    }
}