class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i,j=0,k=0;
        char[] merged = new char[word1.length()+word2.length()];
        for (i=0;i<Math.min(word1.length(),word2.length())*2;i++) {
            if (i%2==0) {
                merged[i] = word1.charAt(j);
                j++;
            }
            else {
                merged[i] = word2.charAt(k);
                k++;
            }
        }
        while (j<word1.length()) {
            merged[i] = word1.charAt(j);
            i++;
            j++;
        }
        while (k<word2.length()) {
            merged[i] = word2.charAt(k);
            i++;
            k++;
        }
        return new String(merged);
    }
}