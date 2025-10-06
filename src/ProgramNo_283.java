/* 283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 */
import java.util.Arrays;
public class ProgramNo_283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
            int pos = 0; // non-zero elements position
            // Step 1: move non-zero elements in  front
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[pos] = nums[i];
                    pos++;
                }
            }
            // Step 2: fill 0 in empty place
            while (pos < nums.length) {
                nums[pos] = 0;
                pos++;
            }
        System.out.println(Arrays.toString(nums));
    }
}

