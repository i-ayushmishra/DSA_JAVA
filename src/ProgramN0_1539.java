/* 1539. Kth Missing Positive Number
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.
 */
public class ProgramN0_1539 {
    public static void main(String[] args){
        int [] arr = {2,3,4,7,11};
        int k = 5;
        int res= findKthPositive( arr, k);
        System.out.println(res);
    }
    public static int findKthPositive(int[] arr, int k){
        int start=0; int end=arr.length-1;
        int ans= arr.length;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]-mid-1>=k){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans+k;
    }
}
