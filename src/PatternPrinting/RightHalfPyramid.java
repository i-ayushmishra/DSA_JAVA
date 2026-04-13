// Problem :- Print Right Half Pyramid Pattern

//  *
//  * *
//  * * *
//  * * * *
//  * * * * *


package PatternPrinting;

public class RightHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int rows=1; rows<=n;rows++){
            for (int col=1;col<=rows;col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
