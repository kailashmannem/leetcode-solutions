class Solution {
    public int maximum69Number (int num) {
        String number = String.valueOf(num);
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i)=='6') {
                return Integer.parseInt(number.substring(0,i) + '9' + number.substring(i+1,number.length()));
            }
        }
        return num;
    }
}