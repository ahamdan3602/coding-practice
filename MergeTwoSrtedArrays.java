class MergeTwoSrtedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int s1 = 0;
        int s2 = 0;
        int[] arr = new int[m+n];
        int i = 0;

        while (s1 < m && s2 < n) {
            if (nums1[s1] < nums2[s2])  {
                arr[i] = nums1[s1];
                s1++;
            } else {
                arr[i] = nums2[s2];
                s2++;
            }
            i++;
        }
        while (s2 < n) {
            arr[i] = nums2[s2];
            s2++;
            i++;
        }
        while (s1 < m) {
            arr[i] = nums1[s1];
            s1++;
            i++;
        }


        for (int j = 0; j < nums1.length;j++) {
            nums1[j] = arr[j];
        }
    }
}
