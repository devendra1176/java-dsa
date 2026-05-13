/*
Given an integer n. You need to recreate the pattern given below for any value of N.
Let's say for N = 5, the pattern should look like as below:

A
BB
CCC
DDDD
EEEEE

*/

public class Pattern_16 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(i+64)); // Print the character corresponding to i (A=65 in ASCII)
            }
            System.out.println(""); // Move to the next line after each row
        }
    }
}

/*
 * PATTERN 16 - Alphabet Pyramid
 *
 * OUTPUT (n=5):
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 *
 * INTUITION:
 * - Outer loop (i) → controls rows (1 to n)
 * - Inner loop (j) → controls columns (1 to i)
 * - Use ASCII values to print characters: 'A' is 65 in ASCII, so we can print (char)(i + 64) to get the correct letter.
 *
 * WHY THIS WORKS:
 * - The outer loop determines how many letters to print in each row (1 in the first row, 2 in the second, etc.)
 * - The inner loop prints the corresponding letter for each column by converting the row number to its ASCII character.
 *
 * For n=5:
 * Row 1: Print j=1 → "A"
 * Row 2: Print j=1,2 → "BB"
 * Row 3: Print j=1,2,3 → "CCC"
 * Row 4: Print j=1,2,3,4 → "DDDD"
 * Row 5: Print j=1,2,3,4,5 → "EEEEE"
 
 * time complexity: O(n^2) due to nested loops
*/