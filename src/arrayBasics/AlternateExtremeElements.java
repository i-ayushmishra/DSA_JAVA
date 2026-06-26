//Given an integer array nums, print the elements in an alternate extreme order.
//Start by printing the first element, then the last element, then the second element, then the second last element, and continue this pattern until all elements are printed.
//Example 1
//Input: nums = [1, 2, 3, 4, 5, 6]
//Output: [1, 6, 2, 5, 3, 4]

package arrayBasics;

public class AlternateExtremeElements {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6};
        alternateElement(nums);
    }
    public static void alternateElement(int [] nums){
        int n=nums.length;
        int i=0;
        int j=n-1;
        while (i<=j){
            if (i==j){
                System.out.print(nums[i] +" ");
            }
            else {
                System.out.print(nums[i] +" ");
                System.out.print(nums[j] +" ");
            }
            i++;
            j--;
        }
    }
}
