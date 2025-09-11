class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, ans, new ArrayList<Integer>());
        return ans;
    }
    private void backtrack(int idx, int[] nums, List<List<Integer>> res, List<Integer> store) {
        res.add(new ArrayList<>(store));
        for (int i = idx; i < nums.length; i++) {
            if (i != idx && nums[i] == nums[i - 1]) continue;
            store.add(nums[i]);
            backtrack(i + 1, nums, res, store);
            store.remove(store.size() - 1);
        }
    }
}