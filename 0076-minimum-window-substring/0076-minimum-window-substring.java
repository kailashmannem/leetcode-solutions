class Solution {
    public String minWindow(String s, String t) {
        String res = "";
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
                    res = s.substring(left, right + 1);
                }
                valid[s.charAt(left)] -= 1;
                left += 1;
            }
        }
        return res;
    }
    private boolean isValid(int[] arr, int[] target) {
        for (int i = 0; i < 128; i++) {
            if (target[i] > arr[i]) return false;
        }
        return true;
    }
}