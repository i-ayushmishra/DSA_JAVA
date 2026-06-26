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
        int size = arr.length;
        int i=0;
        int j=size-1;
        int temp=0;
        while(i<=j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }

}
