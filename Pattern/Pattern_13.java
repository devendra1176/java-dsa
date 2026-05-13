/*
 Given an integer n. You need to recreate the pattern given below for any value of N. 
 Let's say for N = 5, the pattern should look like as below:


 1 
 
 2 3 
 
 4 5 6 
 
 7 8 9 10 
 
 11 12 13 14 15

*/

public class Pattern_13 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1; // Initialize count to 1
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count + " "); // Print the current count
                count++; // Increment count for the next number
            }
            System.out.println(""); // Move to the next line after each row
        }
    }
}

/*
 * PATTERN 13 - Sequential Number Triangle
 *
 * OUTPUT (n=5):
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 *
 * INTUITION:
 * - Outer loop (i) → controls rows (1 to n)
 * - Inner loop (j) → controls columns (1 to i)
 * - Use a variable 'count' to keep track of the current number to print
 * - Increment 'count' after printing each number to ensure sequential output
 *
 * WHY THIS WORKS:
 * - The outer loop determines how many numbers to print in each row (1 in the first row, 2 in the second, etc.)
 * - The inner loop prints the current value of 'count' and then increments it for the next number.
 * - This approach ensures that numbers are printed in a continuous sequence across all rows.
 *
 * For n=5:
 * Row 1: Print count=1 → "1"
 * Row 2: Print count=2,3 → "2 3"
 * Row 3: Print count=4,5,6 → "4 5 6"
 * Row 4: Print count=7,8,9,10 → "7 8 9 10"
 * Row 5: Print count=11,12,13,14,15 → "11 12 13 14 15"
 
 * time complexity: O(n^2) due to nested loops
 * space complexity: O(1) as we are using only a few extra variables
*/