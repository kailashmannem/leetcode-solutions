class Solution {
    public boolean winnerOfGame(String colors) {
        int countA = 0, countB = 0, count = 1;
        for (int i=0;i<colors.length()-1;i++) {
            if (colors.charAt(i)==colors.charAt(i+1)) {
                count++;
            }
            else {
                if (colors.charAt(i)=='A' && count>=3) {
                    countA += (count - 2);
                }
                if (colors.charAt(i)=='B' && count>=3) {
                    countB += (count - 2);
                }
                count = 1;
            }
        }
        if (colors.charAt(colors.length()-1)=='A' && count>=3) {
            countA += (count-2);
        }
        if (colors.charAt(colors.length()-1)=='B' && count>=3) {
            countB += (count-2);
        }
        if (countA == 0) {
            return false;
        }
        if (countA > countB) {
            return true;
        }
        else {
            return false;
        }
    }
}