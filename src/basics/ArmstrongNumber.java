// Problem :- Armstrong number

package basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num =sc.nextInt();
        int countTemp= num;
        int count =0;
        // count digit
        if (countTemp == 0) {
            count = 1;
        } else {
            while (countTemp > 0) {
                countTemp = countTemp / 10;
                count++;
            }
        }
        // Armstrong Number Logic
        int  res=0;
        countTemp=num;
        while (countTemp>0){
            int rem=countTemp%10;
            res += (int) Math.pow(rem, count);
            countTemp=countTemp/10;
        }
        // Compare
        if (res==num){
            System.out.println("Your given number is Armstrong Number");
        }else{
            System.out.println("Your given number is not a Armstrong Number");
        }
        sc.close();
    }
}
