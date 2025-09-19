/*  Running Sum of 1d Array
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
 */

public class ProgramNo_1480 {
    public static void main(String[] args) {
        int [] nums = {3,1,2,10,1};
        runningSum(nums);
    }
    public static int runningSum(int [] nums){
        int [] sumnums = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            sumnums[i]=sum;
            }
        for(int i=0;i<sumnums.length;i++){
            System.out.print(sumnums[i] +" ");
        }
        return 0;
    }
}