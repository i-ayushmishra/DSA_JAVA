/* 81. Search in Rotated Sorted Array II
Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
 */

public class ProgramNo_81 {
    public static void main(String [] args){
        int [] nums = {2,5,6,0,0,1,2};
        int target = 7;
        boolean ans= search(nums, target);
        System.out.println(ans);
    }
    public static  boolean search(int[] nums, int target){
        int res=-1;
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==target){
                return true;
            }
//           if start,mid and end all are same then we can't guarentee which part is sorted , so we wil trim it
            if(nums[mid]==nums[start]&&nums[mid]==nums[end]){
                start=nums[start+1];
                end=nums[end-1];
            }
            // left side is sorted
            else if (nums[mid]>=nums[start]) {
                if (target>=nums[start] && target<nums[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }

            }
            // right side is sorted
            else {
                if (target<=nums[end] && target>nums[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }
        return false;
    }
}
