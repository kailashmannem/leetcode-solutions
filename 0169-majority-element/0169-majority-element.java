class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, most = -1;
        for (int i : nums) {
            if (count == 0) {
                most = i;
            }
            if (most == i) {
                count++;
            } else {
                count--;
            }
        }
        return most;
    }
}