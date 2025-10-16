/* 1009. Complement of Base 10 Integer
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
 */
public class ProgramNo_1009 {
    public static void main(String[] args){
        int n = 5;
        int ans= bitwiseComplement(n);
        System.out.println(ans);
    }
    public static int bitwiseComplement(int n){
        // Step 1: find number of bits
        int mask = 0;
        int temp = n;

        // create mask with all bits = 1
        while (temp > 0) {
            mask = (mask << 1) | 1; // shift left and add 1
            temp >>= 1;             // right shift temp
        }

        // Step 2: XOR with mask
        return n ^ mask;
    }
}
