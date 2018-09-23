package _88;

import java.util.*;
// solution #1
class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] tmp = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                tmp[k++] = nums2[j++];
            } else {
                tmp[k++] = nums1[i++];
            }
        }
        while (i < m) {
            tmp[k++] = nums1[i++];
        }
        while (j < n) {
            tmp[k++] = nums2[j++];
        }
        for (i = 0; i < m + n; i ++) {
            nums1[i] = tmp[i];
        }
    }
}
//class Solution {
//    public void merge(int[] nums1, int m, int [] nums2, int n) {
//        int i = m - 1,j = n - 1,k = m + n -1;
//        while (i >= 0 && j >= 0) {
//            if (nums1[i] < nums2[j]) {
//                nums1[k--] = nums2[j--];
//            } else {
//                nums1[k--] = nums1[i--];
//            }
//        }
//        while (i >= 0) {
//            nums1[k--] = nums1[i--];
//        }
//        while (j >= 0) {
//            nums1[k--] = nums2[j--];
//        }
//    }
//}