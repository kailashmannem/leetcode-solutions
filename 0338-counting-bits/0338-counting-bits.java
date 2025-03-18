class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i=1;i<=n;i++) {
            int temp = i;
            int count = 0;
            while (temp!=0) {
                temp &= (temp-1);
                count++;
            }
            res[i] = count;
        }
        return res;
    }
}