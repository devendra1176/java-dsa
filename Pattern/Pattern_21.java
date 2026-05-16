/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:


*****
*   *
*   *
*   *
*****

*/

public class Pattern_21 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}

/*
 * PATTERN 21 - Hollow Square Star Pattern
 *
 * OUTPUT (n=5):
 * *****
 * *   *
 * *   *
 * *   *
 * *****
 * 
 * CORE CONCEPT:
A hollow square is an n x n grid where only the outer boundary (perimeter) is visible, and the inside remains empty. The code achieves this by checking if the current row or column position lies on any of the four edges of the square.
STEP-BY-STEP LOGIC:

    GRID TRAVERSAL: The outer loop (variable i) controls the rows from 1 to n. The inner loop (variable j) controls the columns from 1 to n. Together, they visit every single cell (i, j) in the grid exactly once.
    BORDER DETECTION: For any given cell (i, j), it belongs to the border if it satisfies ANY of these four conditions:
        i == 1  (Top edge / First row)
        i == n  (Bottom edge / Last row)
        j == 1  (Left edge / First column)
        j == n  (Right edge / Last column)
    PRINT DECISION: 
        If the current (i, j) matches any of the four border conditions, print an asterisk "*".
        Otherwise, it means the cell is strictly inside the square, so print a blank space " ".
    ROW COMPLETION: After the inner loop finishes printing n characters (either * or spaces), the program moves to the next line. This ensures the grid structure is maintained row by row.

INTUITION / VISUAL THINKING:
Think of the square as a coordinate system. The borders are the outermost rows and columns. Everything else is interior space. The if-condition acts as a "gatekeeper" that only allows stars to be printed at the edges, while forcing spaces for all internal coordinates. When n=5, rows 1 and 5 become full lines of stars, and rows 2, 3, and 4 only have stars at the very beginning and very end, leaving the middle positions blank. This combination naturally forms a hollow box.
EXECUTION FLOW SUMMARY (n=5):
Row 1: All columns match border -> Print ***** -> Move to next line
Row 2: Only first & last column match border -> Print *   * -> Move to next line
Row 3: Only first & last column match border -> Print *   * -> Move to next line
Row 4: Only first & last column match border -> Print *   * -> Move to next line
Row 5: All columns match border -> Print ***** -> Move to next line
Pattern complete.
 */