class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, candidates, target, ans, new ArrayList<Integer>());
        return ans;
    }
    private void backtrack(int idx, int[] candidates, int target, List<List<Integer>> res, List<Integer> store) {
        if (target == 0) res.add(new ArrayList<>(store));
        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;
            store.add(candidates[i]);
            backtrack(i + 1, candidates, target - candidates[i], res, store);
            store.remove(store.size() - 1);
        }
    }
}