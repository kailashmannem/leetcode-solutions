class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int num : hours) {
            if (target <= num) count++;
        }
        return count;
    }
}