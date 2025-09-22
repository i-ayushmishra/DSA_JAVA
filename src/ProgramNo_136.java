/* 136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single on
 */


public class ProgramNo_136 {
    public static void main(String[] args){
//        int []  nums = {4,1,2,1,2};
        int []  nums = {2,2,1};
        int ans= singleNumber(nums);
        System.out.println(ans);
    }
    public static int singleNumber(int[] nums){
        int i,j=0;
        for(i=0;i<nums.length;i++) {
            int temp=0;
            for (j= 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    temp++;
                }
            }if(temp==1){
                return nums[i];
            }
        }
        return -1;
    }
}
