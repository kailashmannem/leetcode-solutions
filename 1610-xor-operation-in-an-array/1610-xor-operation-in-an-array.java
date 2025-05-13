class Solution {
    public int xorOperation(int n, int start) {
        int xor = 0;
        while (n!=0) {
            xor ^= start;
            start += 2;
            n--;
        }
        return xor;
    }
}