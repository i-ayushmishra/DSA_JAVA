//Given two integer arrays nums1 and nums2, print all the elements that are present in both arrays.
//The intersection should contain elements that appear in both arrays. If no common element exists, print an appropriate message or return an empty result.
// Example 1
//Input: nums1 = [1, 2, 3, 4, 5]
//       nums2 = [3, 4, 5, 6, 7]
//Output: [3, 4, 5]

package arrayBasics;

public class ArrayIntersection {
    public static void main(String [] args){
        int [] arr1= {1,2,3,4,5};
        int [] arr2= {3,4,5,6,7};
        intersectElements(arr1,arr2);

    }
    public static void intersectElements(int [] arr1, int [] arr2 ){
        int [] temp = new int[arr1.length];
        for (int i=0 ; i< arr1.length;i++){
            for (int j=0;j< arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i] +" ");
                    break;
                }
            }
        }
    }
}
