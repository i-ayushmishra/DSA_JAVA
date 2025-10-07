/* 540. Single Element in a Sorted Array
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
Return the single element that appears only once.
 */

public class ProgramNo_540 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int ans=singleNonDuplicate(nums);
        System.out.println(ans);
    }
    public static  int singleNonDuplicate(int[] nums){
        int start=0; int end=nums.length-1;
        // Edge case: only one element
        if (nums.length == 1) {
            return nums[0];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Make mid even (so we always compare pair correctly)
            if (mid % 2 == 1) {
                mid--;
            }

            // If pair is complete on left side
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }
}
