class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int count = 0;
            int num = i;
            while (num!=0) {
                num = num & (num-1);
                count++;
            }
            if (count==k) sum += nums.get(i);
        }
        return sum;
    }
}