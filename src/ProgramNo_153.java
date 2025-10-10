/* 153. Find Minimum in Rotated Sorted Array
Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 */
public class ProgramNo_153 {
    public static void main(String[] args){
    int [] nums = {4,5,6,7,8,1,2};
    int ans= findMin(nums);
    System.out.println(ans);
   }
    public static int findMin(int[] nums){
        int start=0;
        int end= nums.length-1;
        int minElement= Integer.MAX_VALUE;
        while(start<=end){
            int mid=start+(end-start)/2;
             if (nums[mid]>=nums[start]) {
                minElement= Math.min(minElement,nums[start]);
                    start=mid+1;
            }
            else {
                minElement=Math.min(minElement,nums[mid]);
                    end=mid-1;
                }
            }
        return minElement;
        }
    }

