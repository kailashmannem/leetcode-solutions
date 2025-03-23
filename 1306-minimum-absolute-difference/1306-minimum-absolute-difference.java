class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        var min_arr = new ArrayList<List<Integer>>();
        int min_val = Integer.MAX_VALUE;
        for (int i=1;i<arr.length;i++) {
            int curr = arr[i] - arr[i-1];
            if (min_val > curr) {
                min_val = curr;
                min_arr.clear();
                min_arr.add(Arrays.asList(arr[i-1],arr[i]));
            }
            else if (min_val == curr) {
                min_arr.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return min_arr;
    }
}