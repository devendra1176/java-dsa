/*
Given an integer n. You need to recreate the pattern given below for any value of N. 
Let's say for N = 5, the pattern should look like as below:

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/

public class Pattern_19 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            // Print left side stars
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            // Print spaces
            for(int j=1;j<=2*(i-1);j++){
                System.out.print(" ");
            }
            // Print right side stars
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n;i>=1;i--){
            // Print left side stars
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            // Print spaces
            for(int j=1;j<=2*(i-1);j++){
                System.out.print(" ");
            }
            // Print right side stars
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }    
}

/*
 * PATTERN 19 - Hollow Diamond Star Pattern
 *
 * OUTPUT (n=5):
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 *
 * INTUITION:
 * - The pattern consists of two parts: the upper half and the lower half, which are mirror images of each other.
 * - Outer loop (i) → controls rows (1 to n for upper half, n to 1 for lower half)
 * - First inner loop → prints stars on the left side (n-i+1)
 * - Second inner loop → prints spaces in the middle (2*(i-1))
 * - Third inner loop → prints stars on the right side (n-i+1)
 *
 * WHY THIS WORKS:
 * - The first inner loop creates the left edge of the diamond by printing a decreasing number of stars.
 * - The second inner loop creates the hollow space in the middle, which increases as we move down the rows.
 * - The third inner loop creates the right edge of the diamond, mirroring the left edge.
 *
 * For n=5:
 * Row 1: "**********" + "" + "**********"
 * Row 2: "****" + "  " + "****"
 * Row 3: "***" + "    " + "***"
 * Row 4: "**" + "      " + "**"
 * Row 5: "*" + "        " + "*"
 * Row 6: "*" + "        " + "*"
 * Row 7: "**" + "      " + "**"
 * Row 8: "***" + "    " + "***"
 * Row 9: "****" + "  " + "****"
 * Row 10: "**********" + "" + "**********"
 *
 * TIME COMPLEXITY  : O(n^2)
 * SPACE COMPLEXITY : O(1)
 * Note: The pattern is symmetrical, so we can use the same logic for both halves of 
 * the diamond, which simplifies the implementation and ensures consistency in the output. 
 * - The use of nested loops allows for efficient construction of the pattern, with clear 
 * separation of concerns for each part of the pattern (stars and spaces).
 * - The pattern effectively demonstrates how to manipulate loops and conditional logic to 
 * create complex shapes using simple characters, making it a common exercise in programming 
 * to understand nested loops and pattern generation.
 * - The spaces between the stars are crucial for creating the hollow effect, and the number 
 * of spaces increases as we move down the rows, which is achieved by the second inner loop. 
 * - The symmetry of the pattern is maintained by using the same logic for both halves, 
 * ensuring that the output is visually balanced and aesthetically pleasing.
 * - Overall, this pattern serves as a good example of how to use loops and conditional logic 
 * to create visually appealing patterns in Java, while also reinforcing concepts of symmetry and pattern recognition.
 */
