/* 941. Valid Mountain Array
Given an array of integers arr, return true if and only if it is a valid mountain array.
Recall that arr is a mountain array if and only if:
 */

public class ProgramNo_941 {
    public static void main(String[] args){
//        int [] arr = {0,3,2,1};
        int [] arr = {3,5,5};
        boolean ans = validMountainArray(arr);
        System.out.println(ans);

    }
    public static boolean validMountainArray(int[] arr){
        int n = arr.length; // size of array
        int index=0;
        while(index<n-1){// find peak
            if(arr[index]<arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        if(index==0 || index==n-1){
            return false;
        }
        while(index<n-1){// find last element
            if(arr[index]>arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        return (index==n-1);

    }
}
