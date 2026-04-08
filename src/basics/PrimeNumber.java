// Problem :- Check prime number

package basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num <=1){
            System.out.println("Given Number is not Prime");
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0 ){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Given number is prime");
        }else {
            System.out.println("Given number is not prime");
        }

    }
}
