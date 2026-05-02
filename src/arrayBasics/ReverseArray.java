//Given an integer array nums, return the array after reversing its elements.
//
//Example 1:
//Input: nums = [1, 2, 3, 4]
//Output: [4, 3, 2, 1]

package arrayBasics;

public class ReverseArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int[] reverse = reverseArray(nums);
        for (int i =0; i< reverse.length;i++){
            System.out.print( reverse[i] + " ");
        }

    }
    public static int[] reverseArray(int [] arr){
        int [] tem = new int[arr.length];
        for (int i =0; i< arr.length; i++){
            // temp[0] = arr[length -1-i];  --> means temp 0 = 4 -1-0 , temp  1=4-1-1, temp 2=4-1-2, 3=4-1-3
          tem[i]=arr[arr.length-1-i];   // temp me value fill ho rahi hai, arr ke end se start ki taraf
        }
        return tem;
    }

}
