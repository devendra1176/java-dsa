/*
Given an integer n. You need to recreate the pattern given below for any value of N. 
Let's say for N = 5, the pattern should look like as below:

ABCDE
ABCD
ABC
AB
A

*/
public class Pattern_15 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64)); // Print the character corresponding to j (A=65 in ASCII)
            }
            System.out.println(""); // Move to the next line after each row
        }
    }
}

/*
 * PATTERN 15 - Inverted Alphabet Triangle
 *
 * OUTPUT (n=5):
 * ABCDE
 * ABCD
 * ABC
 * AB
 * A
 *
 * INTUITION:
 * - Outer loop (i) → controls rows (n down to 1)
 * - Inner loop (j) → controls columns (1 to i)
 * - Use ASCII values to print characters: 'A' is 65 in ASCII, so we can print (char)(j + 64) to get the correct letter.
 *
 * WHY THIS WORKS:
 * - The outer loop determines how many letters to print in each row, starting from n and decreasing by 1 each time.
 * - The inner loop prints the corresponding letter for each column by converting the column number to its ASCII character.
 *
 * For n=5:
 * Row 1: Print j=1 to 5 → "ABCDE"
 * Row 2: Print j=1 to 4 → "ABCD"
 * Row 3: Print j=1 to 3 → "ABC"
 * Row 4: Print j=1 to 2 → "AB"
 * Row 5: Print j=1 → "A"
 
 * time complexity: O(n^2) due to nested loops
*/
