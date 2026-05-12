/*
Given an integer n. You need to recreate the pattern given below for any value of N. 
Let's say for N = 5, the pattern should look like as below:

    * 
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/


public class Pattern_9 {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}



/*
intution behind the pattern:


    *          ← Row 1  (top half)
   ***         ← Row 2
  *****        ← Row 3
 *******       ← Row 4
*********      ← Row 5
*********      ← Row 5  (bottom half, mirror)
 *******       ← Row 4
  *****        ← Row 3
   ***         ← Row 2
    *          ← Row 1

It's a Diamond Shape — Pattern 7 + Pattern 8 combined


The Core Idea
Pattern 9  =  Pattern 7 (upper triangle)
            + Pattern 8 (lower triangle, inverted)
That's why the code has two separate loops.

First Loop — Upper Half (Pattern 7)
javafor(int i = 1; i <= n; i++)        // i goes 1→5 (bottom to top)
    for(int j = 1; j <= (n-i); j++) // spaces DECREASE  4,3,2,1,0
    for(int k = 1; k <= (2*i-1); k++) // stars INCREASE  1,3,5,7,9

Second Loop — Lower Half (Pattern 8)
javafor(int i = n; i >= 1; i--)        // i goes 5→1 (notice REVERSE)
    for(int j = 1; j <= (n-i); j++) // spaces INCREASE  0,1,2,3,4
    for(int k = 1; k <= (2*i-1); k++) // stars DECREASE  9,7,5,3,1

*/