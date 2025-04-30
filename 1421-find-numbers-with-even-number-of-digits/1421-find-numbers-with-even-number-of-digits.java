class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if (getCount(num)%2==0) count++;
        }
        return count;
    }

    public int getCount(int num) {
        int count = 0;
        while (num!=0) {
            count++;
            num /= 10;
        }
        return count;
    }
}