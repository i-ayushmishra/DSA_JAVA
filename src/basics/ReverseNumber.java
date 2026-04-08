// Problem:- Reverse a number

package basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int ans=0;
        while (num>0){
            int digit = num % 10;
            ans = ans *10 + digit;
            num = num/10;
        }
        System.out.println("Reverse Number is : " + ans);
    }
}
