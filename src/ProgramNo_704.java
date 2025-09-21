/* 704. Binary Search
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
If target exists, then return its index. Otherwise, return -1.
 */

public class ProgramNo_704 {
    public static void main(String[] args){
        int [] nums = {-1,0,3,5,9,12};
//        int ans= search(nums , 9);
        int ans= search(nums , 2);
        System.out.println(ans);

    }
    public static int search(int[] nums, int target){
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid= start +(end-start)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]>target) {
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
}
