/* 485. Max Consecutive Ones
Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */

public class ProgramNo_485 {
    public static void main(String[] args){
        int [] nums = {1,1,0,1,1,1,1};
        int ans=  findMaxConsecutiveOnes( nums);
        System.out.println(ans);
    }
    public static int findMaxConsecutiveOnes(int[] nums){
        int currentCount=0; int maxCount=0;
        for(int i=0;i< nums.length;i++){
            if (nums[i]==0){
                currentCount=0;
            } else {
                currentCount+=1;
                if (currentCount>maxCount){
                    maxCount=currentCount;
                }
            }
        }
        return maxCount;
    }
}
