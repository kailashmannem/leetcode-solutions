class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        combinations(1, k, n, ans, new ArrayList<Integer>());
        return ans;
    }
    private void combinations(int number, int k, int target, List<List<Integer>> res, List<Integer> store) {
        if (store.size() == k && target == 0) {
            res.add(new ArrayList<>(store));
            return;
        }
        for (int num = number; num <= 9; num++) {
            if (store.size() < k && num <= target) {
                store.add(num);
                combinations(num + 1, k, target - num, res, store);
                store.remove(store.size() - 1);
            }
        }
    }
}