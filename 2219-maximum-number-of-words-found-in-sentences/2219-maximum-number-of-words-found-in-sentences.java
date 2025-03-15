class Solution {
    public int mostWordsFound(String[] sentences) {
        int count,max = 0;
        for (int i=0;i<sentences.length;i++) {
            count = sentences[i].split(" ").length;
            max = Math.max(count, max);
        }
        return max;
    }
}