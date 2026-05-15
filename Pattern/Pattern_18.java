/*
Given an integer n. You need to recreate the pattern given below for any value of N. 
Let's say for N = 5, the pattern should look like as below:


E 
D E 
C D E 
B C D E 
A B C D E 
*/
public class Pattern_18 {
    public static void main(String[] args) {
        int n = 5;
        for(char i=1;i<=n;i++){ 
            
            for(int j=i;j>=1;j--){
                System.out.print((char)((65+n)-j)+" ");
            }
           
        System.out.println("");
        }
    }

}

/* 
 * PATTERN 18 - Inverted Character Pyramid
 *
 * OUTPUT (n=5):
 * E 
 * D E 
 * C D E 
 * B C D E 
 * A B C D E 
 
    * INTUITION:
    * - Outer loop (i) → controls rows (1 to n)
    * - Inner loop → prints characters starting from (65+n-j) to 65, creating an inverted pyramid effect
    * WHY THIS WORKS:
    * - The inner loop calculates the ASCII value for characters based on the current row (i) and prints 
    * them in reverse order, creating the desired pattern.
    * For n=5:
    * Row 1: "E"
    * Row 2: "D E"
    * Row 3: "C D E"
    * Row 4: "B C D E"
    * Row 5: "A B C D E"                        
    * 
    * Note: The character 'A' corresponds to ASCII value 65, so we use (65+n-j) to calculate the correct 
    * character for each position in the pattern.
    * For n=5, the characters printed are:
    * Row 1: (65+5-1) = 69 → 'E'
    * Row 2: (65+5-2) = 68 → 'D', (65+5-1) = 69 → 'E'
    * Row 3: (65+5-3) = 67 → 'C', (65+5-2) = 68 → 'D', (65+5-1) = 69 → 'E'
    * Row 4: (65+5-4) = 66 → 'B', (65+5-3) = 67 → 'C', (65+5-2) = 68 → 'D', (65+5-1) = 69 → 'E'
    * Row 5: (65+5-5) = 65 → 'A', (65+5-4) = 66 → 'B', (65+5-3) = 67 → 'C', (65+5-2) = 68 → 'D', (65+5-1) = 69 → 'E'
    * This results in the desired pattern of characters forming an inverted pyramid. 
    * The spaces between characters are added for better readability and to match the output format. 
    * The pattern effectively demonstrates how to manipulate ASCII values to generate specific character patterns 
    * based on the row number. 
    * The use of nested loops allows for efficient construction of the pattern, with the outer loop controlling the 
    * number of rows and the inner loop handling the character generation for each row. 
    * Overall, this pattern serves as a good example of how to use loops and character manipulation to create 
    * visually appealing patterns in Java.
    * 
 */
