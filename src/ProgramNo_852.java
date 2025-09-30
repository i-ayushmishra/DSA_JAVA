/* 852. Peak Index in a Mountain Array
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
 */

public class ProgramNo_852 {
    public static void main(String[] args){
//        int [] arr = {0,10,5,2};
        int [] arr = {0,10,11,15,5,2};
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    public static int peakIndexInMountainArray(int[] arr){
        int start=0; int end=arr.length-1;
        while (start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
}
