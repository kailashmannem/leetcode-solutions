class Solution {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length()==1) {
            return "";
        }
        boolean flag = false;
        for (int i=0;i<palindrome.length()/2;i++) {
            if (palindrome.charAt(i)!='a') {
                flag = true;
                return palindrome.substring(0,i) + 'a' + palindrome.substring(i+1,palindrome.length());
            }
        }
        if (!flag) {
            return palindrome.substring(0,palindrome.length()-1) + 'b';
        }
        return "";
    }
}