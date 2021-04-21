package finddediansortedarrays;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {2,3,4,5};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length != 0) return (double) nums2[0];
        if (nums2.length == 0 && nums1.length == 1) return (double) nums1[0];
        if (nums2.length == 0 && nums1.length == 0) return (double) 0;

        int i = 0, j = 0, count = 0;
        int position = (nums1.length + nums2.length) / 2;
        while (i < nums1.length || j < nums2.length) {
            if ((nums1.length + nums2.length) % 2 == 0) {
                if (nums1[i] <= nums2[j]) {
                    i ++;
                    if ((i + j) == position - 1) {
                        count += nums1[i];
                    }
                    if ((i + j) == position) {
                        count += nums1[i];
                        return (double) count / 2;
                    }
                } else {
                    j ++;
                    if ((i + j) == position - 1) {
                        count += nums1[i];
                    }
                    if ((i + j) == position) {
                        count += nums1[i];
                        return (double) count / 2;
                    }
                }

            } else {
                if (nums1[i] <= nums2[j]) {
                    i ++;
                    if ((i + j) == position) {
                        return  (double) nums1[i];
                    }
                } else {
                    j ++;
                    if ((i + j) == position) {
                        return  (double) nums1[j];
                    }
                }

            }
        }
        return 0.0;
    }
}
