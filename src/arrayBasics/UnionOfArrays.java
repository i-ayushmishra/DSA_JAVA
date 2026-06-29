//Given two integer arrays nums1 and nums2, print the union of both arrays.
//The union should contain all unique elements that are present in either array. Each element should appear only once in the output.
//The order of elements in the output does not matter.
//Example 1
//Input: nums1 = [1, 2, 3, 4]
//nums2 = [3, 4, 5, 6]
//Output: [1, 2, 3, 4, 5, 6]

package arrayBasics;

import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 ={3,4,5,6};
        arrayUnion(arr1, arr2);
    }
    public static void arrayUnion(int [] arr1, int [] arr2){
        HashSet<Integer>unionArr= new HashSet<>();
        for (int nums:arr1){
            unionArr.add(nums);
        }for (int num:arr2){
            unionArr.add(num);
        }
        System.out.print(unionArr);
    }
}
