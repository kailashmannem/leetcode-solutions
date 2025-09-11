class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, ans, new ArrayList<Integer>());
        return ans;
    }
    private void backtrack(int idx, int[] nums, List<List<Integer>> res, List<Integer> store) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(store));
            return;
        }
        store.add(nums[idx]);
        backtrack(idx + 1, nums, res, store);
        store.remove(store.size() - 1);
        while (idx < nums.length - 1 && nums[idx] == nums[idx + 1]) idx += 1;
        backtrack(idx + 1, nums, res, store);
    }
}