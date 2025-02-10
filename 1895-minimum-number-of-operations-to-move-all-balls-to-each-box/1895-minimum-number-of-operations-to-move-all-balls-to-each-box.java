class Solution {
    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        for (int i=0;i<boxes.length();i++) {
            for (int j=0;j<res.length;j++) {
                if (boxes.charAt(i)=='1') {
                    res[j] += Math.abs(i-j);
                }
            }
        }
        return res;
    }
}