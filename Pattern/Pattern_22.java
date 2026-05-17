/*
Given an integer n. You need to recreate the pattern given below for any value of N.
Let's say for N = 5, the pattern should look like as below:

5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5

*/

public class Pattern_22 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int top = i-1;
                int left = j-1;
                int right = (2*n-1)-j;
                int bottom = (2*n-1)-i;
                System.out.print(n-Math.min(Math.min(top, left), Math.min(right, bottom))+" ");
            }
            System.out.println("");
        }
    }    
}


/*
 * PATTERN 22 - Concentric Square Number Pattern
 *
 * OUTPUT (n=5):
 * 5 5 5 5 5 5 5 5 5 
 * 5 4 4 4 4 4 4 4 5 
 * 5 4 3 3 3 3 3 4 5 
 * 5 4 3 2 2 2 3 4 5 
 * 5 4 3 2 1 2 3 4 5 
 * 5 4 3 2 2 2 3 4 5 
 * 5 4 3 3 3 3 3 4 5 
 * 5 4 4 4 4 4 4 4 5 
 * 
 * CORE CONCEPT:
This pattern is a concentric square of numbers, where the outermost layer is filled with the
number n, the next inner layer with n-1, and so on until the center is reached. The value at
     any position (i, j) is determined by how far it is from the nearest edge of the square.

    STEP-BY-STEP LOGIC:
    GRID SIZE: The pattern forms a (2*n-1) x (2*n-1) grid. This is because for n=5, we need 9 rows and 9 columns to accommodate the layers from 5 down to 1.
    LAYER CALCULATION: For each cell at position (i, j), we calculate its distance from the four edges of the grid:
        top = i - 1 (distance from the top edge)
        left = j - 1 (distance from the left edge)
        right = (2*n-1) - j (distance from the right edge)
        bottom = (2*n-1) - i (distance from the bottom edge)
    The value to be printed at (i, j) is determined by the minimum of these
    four distances, which indicates how many layers deep the cell is. The formula used is:
        value = n - min(top, left, right, bottom)
    This means that the outermost layer (where min distance is 0) will print n
    and as we move inward, the value decreases by 1 for each layer until we reach the center.
    PRINTING: The program iterates through each cell in the grid, calculates the appropriate value
    based on its position, and prints it with a space for separation. After completing each row, it moves to the next line.
    * INTUITION / VISUAL THINKING:
    Imagine the grid as a series of nested squares. The outermost square is filled with n
and as you move towards the center, each subsequent square layer decreases the number by 1. The distance from the edges determines which layer a cell belongs to, and thus what number it should print. For n=5, the outermost layer (distance 0) prints 5, the next layer (distance 1) prints 4, and so on until the center (distance 4) prints 1.
    * EXECUTION FLOW SUMMARY (n=5):
    Row 1: All cells have min distance 0 → Print 5
    Row 2: Cells near edges have min distance 0 → Print 5, cells
    one layer in have min distance 1 → Print 4
    Row 3: Cells near edges have min distance 0 → Print 5, cells
    one layer in have min distance 1 → Print 4, cells two layers in have min distance 2 → Print 3
    Row 4: Cells near edges have min distance 0 → Print 5, cells
    one layer in have min distance 1 → Print 4, cells two layers in have
    min distance 2 → Print 3, cells three layers in have min distance 3 → Print 2
    Row 5: Cells near edges have min distance 0 → Print 5, cells
    one layer in have min distance 1 → Print 4, cells two layers in have
    min distance 2 → Print 3, cells three layers in have min distance 3 → Print 2, center cell has min distance 4 → Print 1
    Row 6: Mirror of Row 4
    Row 7: Mirror of Row 3
    Row 8: Mirror of Row 2
    Row 9: Mirror of Row 1
    * time complexity: O(n^2) due to the nested loops iterating through a
    (2*n-1) x (2*n-1) grid
    * space complexity: O(1) as we are using only a few extra variables for
    calculations
*/ 

