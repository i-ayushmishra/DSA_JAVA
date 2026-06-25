//Given an integer array nums, swap every pair of adjacent elements and return the updated array.
//In other words:
//Swap the 1st element with the 2nd element.
//Swap the 3rd element with the 4th element.
//Swap the 5th element with the 6th element, and so on.
//
//If the array contains an odd number of elements, the last element remains unchanged.
//Example 1
//Input: nums = [1, 2, 3, 4, 5, 6]
//Output:        [2, 1, 4, 3, 6, 5]

package arrayBasics;

public class SwapAlternateElements {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6,};
        int [] ans= swapElement(arr);
        for (int i=0;i< ans.length;i++){
            System.out.print(ans[i] +" ");
        }
        }
        public static int[] swapElement(int [] arr){
         int [] temp = new int[arr.length];
         for (int i=0;i< arr.length-1;i=i+2){
                 temp[i]=arr[i+1];
                 temp[i+1]=arr[i];
         }
// If the array contains an odd number of elements, the last element remains unchanged
            if (arr.length%2!=0){
                temp[arr.length-1]=arr[arr.length-1];
            }
        return temp;
        }
}
