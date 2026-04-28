// Problem 1: Sum of Elements
//
//Given an integer array nums, return the sum of all elements in the array.
//
//Example 1:
//Input: nums = [1,2,3,4,5]
//Output: 15

package arrayBasics;

public class SumOfElements {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        sumOfArray(nums);
    }
    public static void sumOfArray( int [] nums ){
        int sum =0;
        for (int i = 0; i<nums.length; i++){
            sum+= nums[i];
        }
        System.out.println("The sum of given array is " + sum);
    }
}
