class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        int[] view = new int[A.length + 1];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (view[A[i]]==0) view[A[i]] = 1;
            else if (view[A[i]]==1) count++;
            if (view[B[i]]==0) view[B[i]] = 1;
            else if (view[B[i]]==1) count++;
            res[i] = count;
        }
        return res;
    }
}