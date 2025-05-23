class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        res[0] = first;
        for (int i = 1; i <= encoded.length; i++) {
            res[i] = res[i-1] ^ encoded[i-1];
        }
        return res;
    }
}