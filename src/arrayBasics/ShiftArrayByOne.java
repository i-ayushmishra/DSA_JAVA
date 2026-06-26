//Given an integer array nums, shift all elements of the array by one position to the right.
//The last element should move to the first position, and every other element should move one position ahead.
//Return the updated array.
//Example
//Input: nums = [1, 2, 3, 4, 5]
//Output: [5, 1, 2, 3, 4]

package arrayBasics;

public class ShiftArrayByOne {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5};
        shiftByOne(nums);
    }
    public static void shiftByOne(int[] nums){
        int n= nums.length;
        int temp=nums[n-1];
        for (int i=n-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=temp;

        for(int arr : nums){
            System.out.print(arr +" ");
        }
    }

}
