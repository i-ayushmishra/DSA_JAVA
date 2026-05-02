//Given an integer array nums, return the minimum element present in the array.
//
//Example 1:
//Input: nums = [3, 1, 4, 2]
//Output: 1


package arrayBasics;

public class MinimumElement {
    public static void main(String[] args) {
        int [] nums={3,1,4,2,6,9,5};
        int min = minElement(nums);
        System.out.println("The minimum element present in array is "+ min);
    }
    public static int minElement(int [] arr){
        int minimum= arr[0];
        for (int i =0; i< arr.length;i++){
            if (arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return minimum;
    }
}
