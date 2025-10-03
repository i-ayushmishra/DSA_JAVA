/* 7. Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */

public class ProgramNo_7 {
    public static void main(String[] args){
        int x = 1234;
        int ans= reverse(x);
        System.out.println(ans);
    }
    public static int reverse(int x){
        int anss=0;
        while(x!=0){
            int rem=x%10;
            x=x/10;
            anss=(anss*10)+rem;
        }
        return anss;
    }
}
