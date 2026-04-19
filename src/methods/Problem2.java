// Problem:- Create a method ADD(int a, int b) that return the sum.

package methods;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the second number ");
        int b = sc.nextInt();
        System.out.println("The sum of these two numbers is " + add(a,b));
    }
    public static int add(int a, int b){
        return a+b;
    }
}
