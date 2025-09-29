/* Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.
*/

public class ProgramNo_231 {
    public static void main(String[] args){
        int  n = 16;
        boolean ans= isPowerOfTwo(n);
        System.out.println(ans);

    }
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);  // by using  bitwise operator
    }
}


/*  n  = 16 → 10000
    n-1= 15 → 01111

    n     = 10000
    n - 1 = 01111
   ----------------
    AND   = 00000   → 0

 */