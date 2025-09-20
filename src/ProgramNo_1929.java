/* Concatenation of Array
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays. Return the array ans
 */

public class ProgramNo_1929 {
    public static void main(String[] args){
        int [] nums = {1,2,1};
        int[] result = getConcatenation(nums);
        System.out.print("Final Array: ");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    public static int[] getConcatenation(int[] nums){
        int n=nums.length;
        int[] ans = new int[2*n];
        int i=0;
            for(i=0;i<n;i++){
                ans[i] =nums[i];
            }
        for(i=0;i<n;i++){
            ans[i+n] =nums[i];
        }
        return ans;
    }
}
