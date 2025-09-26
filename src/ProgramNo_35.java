/* 35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 */

public class ProgramNo_35 {
    public static void main(String[] args){
//        int [] nums = {1,3,5,6};
//        int target = 5;
        int [] nums = {1,3,5,6};
        int target = 2;
        int res= searchInsert(nums,target);
        System.out.println(res);
    }
    public static int searchInsert(int[] nums, int target){
        int start=0; int end= nums.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        int pos = start;
        int n= nums.length-1;
        for (int i = n; i > pos; i--) {
            nums[i] =nums[i - 1];
            nums[pos] = target;
            n++;
        }



        return pos;
    }

}
