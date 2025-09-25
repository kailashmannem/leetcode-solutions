class Solution {
    public String minWindow(String s, String t) {
        int[] res = new int[]{-1, -1};
        int min = Integer.MAX_VALUE;
        int[] target = new int[128];
        for (char ch : t.toCharArray()) target[ch] += 1; 
        int[] valid = new int[128];
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            valid[s.charAt(right)] += 1;
            while (isValid(valid, target)) {
                if (min > right - left + 1) {
                    min = right - left + 1;
                    res[0] = left; res[1] = right;
                }
                valid[s.charAt(left)] -= 1;
                left += 1;
            }
        }
        return (res[0] == -1 || res[1] == -1) ? "" : s.substring(res[0], res[1] + 1);
    }
    private boolean isValid(int[] arr, int[] target) {
        for (int i = 0; i < 128; i++) {
            if (target[i] > arr[i]) return false;
        }
        return true;
    }
}