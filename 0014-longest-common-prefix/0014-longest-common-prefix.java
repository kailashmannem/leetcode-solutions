class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < Math.min(strs[i].length(), res.length())) {
                if (strs[i].charAt(j)!=res.charAt(j)) {
                    break;
                }
                if (res.isEmpty()) return res;
                j++;
            }
            res = res.substring(0,j);
        }
        return res;
    }
}