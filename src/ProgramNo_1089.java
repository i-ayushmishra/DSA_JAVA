/* 1089. Duplicate Zeros
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 */

import java.util.Arrays;

public class ProgramNo_1089 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        int zeros = 0;
        int n = arr.length;
        // Step 1: count zeros
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zeros++;
        }

        // Step 2: move from end
        for (int i = n - 1; i >= 0; i--) {
            if (i + zeros < n)
                arr[i + zeros] = arr[i];

            if (arr[i] == 0) {
                zeros--;
                if (i + zeros < n)
                    arr[i + zeros] = 0; // duplicate zero
                    }
                }
            }
}
