// Given an integer array nums and an integer target, return the index of the target element using Linear Search.
//If the target element is not present in the array, return -1.
//Example 1
//Input: nums = [1, 2, 3, 4, 5]
//target = 3
//Output: 2

package arrayBasics;

public class LinearSearch {
    public static void main(String[] args) {
        int [] num ={1,2,3,4,5};
        int target = 3;
        int res = targetIndex(num, target);
        System.out.println(res);
    }
    public static int targetIndex(int[] arr, int temTarget){
        for (int i =0; i<arr.length;i++){
            if (temTarget==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
