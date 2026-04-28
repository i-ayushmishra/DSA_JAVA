//Problem 2: Maximum Element
//
//Given an integer array nums, return the maximum element present in the array.
//
//Example 1:
//Input: nums = [1, 3, 2, 5, 4]
//Output: 5

package arrayBasics;

public class MaximumElement {
    public static void main(String[] args) {
        int [] nums={1,3,2,5,4};
        int max=maxNum(nums);
        System.out.println("Maximum element in given array is "+ max);
    }
    public static int maxNum(int [] nums){
        int maximum=nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i]>maximum){
                maximum=nums[i];
            }
        }
        return maximum;
    }
}
