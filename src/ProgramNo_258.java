/* 258. Add Digits
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 */

public class ProgramNo_258 {
    public static void main(String[] args){
        int num = 48;
        int ans=addDigits(num);
        System.out.println(ans);
    }
    public static int addDigits(int num){
        while(num>9){
            int rem=0;
            int ans=0;
            while(num!=0){
                rem=num%10;
                num=num/10;
                ans+=rem;
            }
            num=ans;
        }
        return num;
    }
}