class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0, op = 0;
        for (int num : nums) xor ^= num;
        while (k!=0 || xor!=0) {
            if ((k&1) != (xor&1)) {
                op += 1;
            }
            k >>= 1;
            xor >>= 1;
        }
        return op;
    }
}