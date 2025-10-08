/* 33. Search in Rotated Sorted Array

 */

public class ProgramNo_33 {
    public static void main(String[] args){
        int []  nums = {4,5,6,7,0,1,2};
        int target = 2;
        int ans= search(nums, target);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target){
        int res=-1;
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==target){
                res=mid;
                return res;
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
        return res;
    }
}
