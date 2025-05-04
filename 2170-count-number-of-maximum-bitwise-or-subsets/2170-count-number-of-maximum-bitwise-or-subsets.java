class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int max = -1, maxCount = -1;
        for (int a = 0; a < (1<<nums.length); a++) {
            int num = a;
            int i = 0;
            int sub = 0;
            while (num!=0) {
                if ((num&1)==1) {
                    sub |= nums[i];
                }
                i++;
                num >>= 1;
            }
            if (sub > max) {
                max = sub;
                maxCount = 1;
            }
            else if (sub == max) {
                maxCount += 1;
            }
        }
        return maxCount;
    }
}