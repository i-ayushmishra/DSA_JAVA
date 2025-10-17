/* 292. Nim Game
Given n, the number of stones in the heap, return true if you can win the game assuming both you and your friend play optimally, otherwise return false.
 */

public class ProgramNo_292 {
    public static void main(String[] args){
        int n=1;
        boolean ans= canWinNim( n);
        System.out.println(ans);
    }
    public static boolean canWinNim(int n){
        if (n%4!=0){
            return true;
        }
        return false;
    }
}
