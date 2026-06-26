//Given an integer array nums, return the mode of the array.
//The mode is the element that appears most frequently in the array.
//If multiple elements have the same highest frequency, return the one that appears first in the array.
//Example 1
//Input: nums = [1, 2, 2, 3, 4]
//Output: 2

package arrayBasics;

import java.util.HashMap;

public class FindModeOfArray {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,4};
        modeOfArray(nums);
    }
    public static void modeOfArray(int [] nums) {

        // brute force logic
//        int mode=nums[0];
//        int maxCount=0;
//
//        for (int i=0; i< nums.length;i++){
//            int count=0;
//            for (int j=0;j< nums.length;j++){
//                if (nums[i]==nums[j]){
//                    count++;
//                }
//            }
//            if (count>maxCount){
//                maxCount=count;
//                mode=nums[i];
//            }
//        }
//        System.out.println(mode);


        // optimised logic

        HashMap<Integer,Integer>map = new HashMap<>();
        int mode=nums[0];
        int maxCount=0;
        for (int num:nums){
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else {
                map.put(num,1);
            }
            if (map.get(num)>maxCount){
                maxCount=map.get(num);
                mode = num;
            }
        }
        System.out.println(mode);
    }
}
