package finddediansortedarrays;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {2,3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums2.length == 0 && nums1.length == 0) return (double) 0;

        if (nums1.length == 0 && nums2.length != 0) {
            if(nums2.length % 2 == 0){
                return (double) (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2;
            } else {
                return (double) nums2[nums2.length / 2];
            }
        }
        if (nums2.length == 0 && nums1.length != 0) {
            if(nums1.length % 2 == 0){
                return (double) (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2;
            } else {
                return (double) nums1[nums1.length / 2];
            }
        };


        int i = 0, j = 0, count = 0;
        int position = (nums1.length + nums2.length) / 2;
        while (i < nums1.length && j < nums2.length) {
            if ((nums1.length + nums2.length) % 2 == 0) {
                if (i < nums1.length && nums1[i] <= nums2[j]) {
                    if ((i + j) == position - 1) {
                        count += nums1[i];
                    }
                    if ((i + j) == position) {
                        count += nums1[i];
                        return (double) count / 2;
                    }
                    i ++;
                } else {
                    if ((i + j) == position - 1) {
                        count += nums2[j];
                    }
                    if ((i + j) == position) {
                        count += nums2[j];
                        return (double) count / 2;
                    }
                    j ++;
                }

            } else {
                if (i < nums1.length  &&  nums1[i] <= nums2[j]) {
                    if ((i + j) == position) {
                        return  (double) nums1[i];
                    }
                    i ++;
                } else {
                    if ((i + j) == position) {
                        return  (double) nums2[j];
                    }
                    j ++;
                }

            }
        }
        if ((nums1.length + nums2.length) % 2 == 0) {
            while(i < nums1.length || j < nums2.length){
                if (i < nums1.length) {
                    if ((i + j) == position - 1) {
                        count += nums1[i];
                    }
                    if ((i + j) == position) {
                        count += nums1[i];
                        return (double) count / 2;
                    }
                    i++;
                }
                if(j < nums2.length) {
                    if ((i + j) == position - 1) {
                        count += nums2[j];
                    }
                    if ((i + j) == position) {
                        count += nums2[j];
                        return (double) count / 2;
                    }
                    j ++;
                }
            }
        } else {
            while(i < nums1.length || j < nums2.length){
                if (i < nums1.length) {
                    if ((i + j) == position) {
                        return  (double) nums1[i];
                    }
                    i ++;
                }
                if (j < nums2.length) {
                    if ((i + j) == position) {
                        return  (double) nums2[j];
                    }
                    j ++;
                }
            }

        }

        return 0.0;
    }
}
