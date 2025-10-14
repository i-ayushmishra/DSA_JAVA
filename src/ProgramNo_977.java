/* 977. Squares of a Sorted Array
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 */

import java.util.Arrays;
public class ProgramNo_977 {
    public static void main(String[] args){
        int [] nums = {-4,-1,0,3,10};
        int[] ans = sortedSquares(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] sortedSquares(int[] nums){
                int n = nums.length;
                int[] result = new int[n];
                int left = 0, right = n - 1;
                int index = n - 1;

                while (left <= right) {
                    int leftSq = nums[left] * nums[left];
                    int rightSq = nums[right] * nums[right];
                    if (leftSq > rightSq) {
                        result[index--] = leftSq;
                        left++;
                    } else {
                        result[index--] = rightSq;
                        right--;
                    }
                }
                return result;

        }

    }

