/* 69. Sqrt(x)
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
The returned integer should be non-negative as well.
 */
public class ProgramNo_69 {
    public static void main(String[] args){
        int x = 25;
        int ans= mySqrt( x);
        System.out.println(ans);
    }
    public static int mySqrt(int x){
        int res=0; int start=1; int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((mid*mid)<=x){
                res=mid;
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return res;
    }
}
