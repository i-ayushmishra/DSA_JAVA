// Problem:- Print Left Half Pyramid Pattern

//          *
//        * *
//      * * *
//    * * * *
//  * * * * *

package PatternPrinting;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int rows=1;rows<=n;rows++){
            for (int col = 1; col<=n-rows;col++){
                System.out.print("  ");
            }
            for (int j= 1;j<=rows;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
