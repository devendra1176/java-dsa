/*
Given an integer n. You need to recreate the pattern given below for any value of N. 
Let's say for N = 5, the pattern should look like as below:


    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

*/

public class Pattern_17 {

    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            // Print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // Print left side characters
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            // Print right side characters
            for(int j=i-1;j>=1;j--){
                System.out.print((char)(j+64));
            }
            System.out.println("");
        }
    }
}

/*
 * PATTERN 17 - Palindromic Character Pyramid
 *
 * OUTPUT (n=5):
 *     A
 *    ABA
 *   ABCBA
 *  ABCDCBA
 * ABCDEDCBA
 *
 * INTUITION:
 * - Outer loop (i) → controls rows (1 to n)
 * - First inner loop → prints spaces (n-i) to center the pattern
 * - Second inner loop → prints ascending characters from 'A' to the i-th character
 * - Third inner loop → prints descending characters from the (i-1)-th character back to 'A'
 *
 * WHY THIS WORKS:
 * - The first inner loop creates the necessary spacing to center the pattern.
 * - The second inner loop builds the left half of the pattern using ASCII values to convert numbers to characters.
 * - The third inner loop builds the right half, mirroring the left half in reverse order.
 *
 * For n=5:
 * Row 1: "    " + "A" + ""
 * Row 2: "   " + "AB" + "A"
 * Row 3: "  " + "ABC" + "BA"
 * Row 4: " " + "ABCD" + "CBA"
 * Row 5: "" + "ABCDE" + "DCBA"

    * TIME COMPLEXITY  : O(n^2)
    * SPACE COMPLEXITY : O(1) 

*/