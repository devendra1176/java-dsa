/* 
Given an integer n. You need to recreate the pattern given below for any value of N. 
Let's say for N = 5, the pattern should look like as below:

1        1
12      21
123    321
1234  4321
1234554321

*/

public class Pattern_12 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            // Print left side numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            // Print spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Print right side numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}

/*
 * PATTERN 12 - Palindromic Number Pyramid
 *
 * OUTPUT (n=5):
 * 1        1
 * 12      21
 * 123    321
 * 1234  4321
 * 1234554321
 *
 * INTUITION:
 * - Outer loop (i) → controls rows (1 to n)
 * - First inner loop → prints ascending numbers from 1 to i
 * - Second inner loop → prints spaces (2*(n-i)) to create the gap
 * - Third inner loop → prints descending numbers from i to 1
 *
 * WHY THIS WORKS:
 * - The first inner loop builds the left half of the pattern.
 * - The second inner loop creates the necessary spacing to align the right half.
 * - The third inner loop builds the right half, mirroring the left half in reverse order.
 *
 * For n=5:
 * Row 1: "1" + "        " + "1"
 * Row 2: "12" + "      " + "21"
 * Row 3: "123" + "    " + "321"
 * Row 4: "1234" + "  " + "4321"
 * Row 5: "12345" + "" + "54321"

 * TIME COMPLEXITY  : O(n^2)
 * SPACE COMPLEXITY : O(1)
*/