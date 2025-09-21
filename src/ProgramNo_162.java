/* Find Peak Element
Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 */

public class ProgramNo_162 {
    public static void main(String[] args){
//        int[] nums = {1,2,3,1};
        int[] nums = {1,2,1,3,5,6,4};
        int element= findPeakElement( nums);
        System.out.println(element);
    }
    public static int findPeakElement( int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid= start +(end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }

}
