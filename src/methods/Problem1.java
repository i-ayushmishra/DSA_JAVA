// Problem:- Create a method print WelcomeMessage() that prints a greeting..

package methods;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name:-  ");
        String name = sc.nextLine();
        welcomeMessage(name);

    }
    public static void welcomeMessage(String name){
        System.out.println("Hii " + name + " Welcome to my DSA journey.....");
    }
}
