// Given an integer array nums, return the average of all elements present in the array.
//Return the result as a floating-point number.
//Example 1
//Input: nums = [1, 2, 3, 4, 5]
//Output: 3.0


package arrayBasics;

public class AverageOfArray {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        double avg = findAverage(num);
        System.out.println("The Average of the given array is "+ avg);
    }
    public static double findAverage(int [] arr){
        int i=0;
        int n= arr.length;
        double temp=0;
        for (i=0;i<n;i++){
            temp+= arr[i];
        }
        return temp/n;
    }
}
