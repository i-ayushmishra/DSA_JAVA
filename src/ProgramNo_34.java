/* 34. Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1]

*/

public class ProgramNo_34 {
    public static void main(String[] args){
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        int []res= new int[2];   // return starting and ending index
        int first = firstoccurance(nums,target);
        int last= lastoccurance(nums, target);
        res[0]=first;
        res[1]=last;
        System.out.println(res[0] + " " + res[1]);
    }
    public static int firstoccurance(int[] nums,int target){
        int start=0; int end=nums.length-1; int ans=-1;
        while(start<=end){
            int mid= start + (end - start)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            } else if (nums[mid]<target) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static int lastoccurance(int[] nums,int target){
        int start=0; int end=nums.length-1; int ans=-1;
        while(start<=end){
            int mid= start + (end - start)/2;
            if(nums[mid]==target){
                ans=mid;
                start=mid+1;
            } else if (nums[mid]<target) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

}

