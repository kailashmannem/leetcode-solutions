import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combined = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i<nums1.length && j<nums2.length) {
            if (nums1[i]<=nums2[j]) {
                combined[k++] = nums1[i++];
            }
            else {
                combined[k++] = nums2[j++];
            }
        }
        while (i<nums1.length) {
            combined[k++] = nums1[i++];
        }
        while (j<nums2.length) {
            combined[k++] = nums2[j++];
        }

        if ((combined.length)%2!=0)
            return (double) combined[combined.length/2];
        else
            return (double) (combined[combined.length/2 - 1] + combined[combined.length/2])/2;
    }
}