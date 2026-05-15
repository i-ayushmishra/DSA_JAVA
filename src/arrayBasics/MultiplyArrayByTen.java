// Given an integer array nums, multiply each element of the array by 10 and return the updated array.
// Example 1
// Input: nums = [1, 2, 3, 4]
// Output: [10, 20, 30, 40]

package arrayBasics;

public class MultiplyArrayByTen {
    public static void main(String[] args) {
        int [] num={1,2,3,4,5};
        int [] mul = multiplyArray(num);
        for (int i =0;i< mul.length;i++){
            System.out.print(mul[i] + " ");
        }
    }
    public static int [] multiplyArray(int[] arr){
        int i=0;
        int n= arr.length;
        int [] temp= new int[arr.length];
        for (i=0;i<n;i++){
            temp[i]=arr[i]*10;
        }
        return temp;
    }
}
