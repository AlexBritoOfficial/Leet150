public class MergeSortedArray88 {


    public MergeSortedArray88(){

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        mergeHelper(nums1, m, nums2, n);
    }

    public void mergeHelper(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2, if any
            nums1[finished--] = nums2[tail2--];
        }
    }


    public static void main(String[] args) {
//
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};

        int m = 3;
        int n = 3;
////
//        int nums1[] = {2,0};
//        int nums2[] = {1};
//
//        int m = 1;
//        int n = 1;

//// case 3
//        int nums1[] = {4,5,6,0,0,0};
//        int nums2[] = {1,2,3};
//        int m = 3;
//        int n = 3;

//
//        int [] nums1 = {0,0,0,0,0};
//        int [] nums2 = {1,2,3,4,5};
//        int m = 0;
//        int n = 5;

//        int[] nums1 = {1, 2, 4, 5, 6, 0};
//        int[] nums2 = {3};
//        int m = 5;
//        int n = 1;
        MergeSortedArray88 mergeSortedArray88 = new MergeSortedArray88();
        mergeSortedArray88.merge(nums1, m, nums2, n);

    }
}
