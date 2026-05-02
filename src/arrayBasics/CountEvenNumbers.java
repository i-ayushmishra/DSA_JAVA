//Given an integer array nums, return the count of even numbers in the array.
//
//Example 1:
//Input: nums = [1, 2, 3, 4, 5, 6]
//Output: 3

package arrayBasics;

public class CountEvenNumbers {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8};
        int countEven = countEvenNumber(nums);
        System.out.println( "The count of even numbers in the array is " + countEven);
    }
    public static int countEvenNumber(int [] arr){
        int count =0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
