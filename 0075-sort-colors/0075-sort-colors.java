class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < nums.length; i++) {
            zero = (nums[i] == 0) ? zero + 1 : zero;
            one = (nums[i] == 1) ? one + 1 : one;
            two = (nums[i] == 2) ? two + 1 : two;
        }
        for (int i = 0; i < nums.length; i++) {
            if (zero != 0) {
                nums[i] = 0;
                zero--;
            } else if (one != 0) {
                nums[i] = 1;
                one--;
            } else {
                nums[i] = 2;
                two--;
            }
        }
    }
}