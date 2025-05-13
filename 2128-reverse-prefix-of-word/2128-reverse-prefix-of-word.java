class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        int i = 0, j = word.indexOf(ch);
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}