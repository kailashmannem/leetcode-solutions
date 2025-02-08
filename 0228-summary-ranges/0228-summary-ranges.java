class Solution {
    public List<String> summaryRanges(int[] nums) {
        var sl = new LinkedList<String>();
        if (nums.length==0) {
            return sl;
        }
        int first = nums[0];
        for (int i=0;i<nums.length-1;i++) {
            if (nums[i]+1!=nums[i+1]) {
                if (first==nums[i]) {
                    sl.add(Integer.toString(first));
                }
                else {
                    sl.add(first + "->" + nums[i]);
                }
                first = nums[i+1];
            }
        }
        sl.add((first==nums[nums.length-1])?Integer.toString(first):first + "->" + nums[nums.length-1]);
        return sl;
    }
}