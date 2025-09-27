/* 744. Find Smallest Letter Greater Than Target
You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
There are at least two different characters in letters. Return the smallest character in letters that is lexicographically greater than target.
 If such a character does not exist, return the first character in letters.
 */

public class ProgramNo_744 {
    public static void main(String[] args){
        char [] letters = {'c','f','j'};
        char target = 'd';
        char res = nextGreatestLetter(letters, target);
        System.out.println(res);
    }
    public static char nextGreatestLetter(char[] letters, char target){
        int start=0; int end=letters.length-1;
        char ans='#';
        while (start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]>target){
                ans=letters[mid];
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        if (ans=='#'){
            return letters[0];
        }
        return ans;
    }
}
