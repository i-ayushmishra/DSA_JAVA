// Problem :-  Check palindrome number

package basics;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int userNum = sc.nextInt();
        int num = userNum;
        int ans=0;
        while (num>0){
            int digit = num % 10;
            ans = ans *10 + digit;
            num = num/10;
        }
       if (userNum == ans){
           System.out.println("Your given number "+ userNum + " is a palindrome number");
       }else{
           System.out.println("Your given number "+ userNum + " is not  a palindrome number");
       }
        sc.close();
    }
}
