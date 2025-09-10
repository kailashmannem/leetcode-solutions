class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(0, candidates, target, ans, new ArrayList<Integer>());
        return ans;
    }
    private void combination(int idx, int[] candidates, int target, List<List<Integer>> res, List<Integer> store) {
        if (idx == candidates.length) {
            if (target == 0) res.add(new ArrayList<>(store));
            return;
        }
        if (candidates[idx] <= target) {
            store.add(candidates[idx]);
            combination(idx, candidates, target - candidates[idx], res, store);
            store.remove(store.size() - 1);
        }
        combination(idx + 1, candidates, target, res, store);
    }
}