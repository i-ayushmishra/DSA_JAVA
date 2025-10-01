/* 1095. Find in Mountain Array
Given a mountain array mountainArr, return the minimum index.
If such an index does not exist, return -1.

 */

public class ProgramNo_1095 {
    public static void main(String[] args){
        int[] mountainArr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans= findInMountainArray( target,mountainArr);
        System.out.println(ans);

    }
    public static int findInMountainArray(int target, int [] mountainArr){
        int n=mountainArr.length;
        int start=0; int end=n-1;
        // first find the peak
        while (start<end){
            int mid=start+(end-start)/2;
//            if (mountainArr[mid]==target){
//                return mid;
//            }
              if(mountainArr[mid]<mountainArr[mid+1]){
               start=mid+1;
            }else{
                end=mid;
            }
        }
        int peak=start;
        // find in increasing
        int start1=0;
        int last=peak-1;
        while (start1<=last){
            int mid=start1+(last-start1)/2;
            if (mountainArr[mid]==target){
                return mid;
            }
            else if(mountainArr[mid]<target){
                start1=mid+1;
            }else{
                last=mid-1;
            }
        }
        //in decreasing order
        int first=start;
        int last1=n-1;
        while (first<=last1){
            int mid=first+(last1-first)/2;
            if (mountainArr[mid]==target){
                return mid;
            }
            else if(mountainArr[mid]>target){
                first=mid+1;
            }else{
                last1=mid-1;
            }
        }

        return -1;
    }
}
