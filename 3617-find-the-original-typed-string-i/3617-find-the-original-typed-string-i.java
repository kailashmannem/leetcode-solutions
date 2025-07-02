class Solution {
    public int possibleStringCount(String word) {
        int ans = 1, count = 1;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i+1)) count++;
            else {
                ans += (count - 1);
                count = 1;
            }
        }
        ans += (count!=0)?count - 1:0;
        return ans;
    }
}