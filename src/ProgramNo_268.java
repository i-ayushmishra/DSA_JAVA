/* 268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */

public class ProgramNo_268{
    public static void main(String[] args){
        int []  nums = {9,6,4,2,3,5,7,0,1};
        int res= missingNumber(nums);
        System.out.println(res);
    }
    public static int missingNumber(int[] nums){
        int n= nums.length;
        int ExpectedSum = n*(n+1)/2;
        int realsum =0,num=0;
        for(int i=0;i<nums.length;i++){
            realsum+=nums[i];
        }
        num= ExpectedSum - realsum;
        return num;
    }

}
