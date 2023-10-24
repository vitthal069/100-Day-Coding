class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int[] mergedArray = new int[m + n];

    int i = 0;
    int j = 0;

    while (i < m && j < n) {
        if (nums1[i] < nums2[j]) {
            mergedArray[i + j] = nums1[i];
            i++;
        } else {
            mergedArray[i + j] = nums2[j];
            j++;
        }
    }

    if (i < m) {
        System.arraycopy(nums1, i, mergedArray, i + j, m - i);
    } else {
        System.arraycopy(nums2, j, mergedArray, i + j, n - j);
    }

    System.arraycopy(mergedArray, 0, nums1, 0, m + n);  
    }
}