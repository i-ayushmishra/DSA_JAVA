/* 154. Find Minimum in Rotated Sorted Array II
Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.
You must decrease the overall operation steps as much as possible.
 */

public class ProgramNo_154 {
    public static void main(String[] args){
        int [] nums = {2,2,2,0,1};
        int ans = findMin(nums);
        System.out.println(ans);
    }
    public static int findMin(int[] nums){
        int start=0;
        int end= nums.length-1;
        int minElement= Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                start++;
                end--;
            }
            else if (nums[mid]>=nums[start]) {
                minElement= Math.min(minElement,nums[start]);
                start=mid+1;
            }
            else {
                minElement=Math.min(minElement,nums[mid]);
                end=mid-1;
            }
        }
        return minElement;
    }
}
