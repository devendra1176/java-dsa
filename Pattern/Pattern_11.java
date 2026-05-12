/* 
Given an integer n. You need to recreate the pattern given below for any value of N. 
Let's say for N = 5, the pattern should look like as below:


1 

0 1 

1 0 1 

0 1 0 1 

1 0 1 0 1

*/

public class Pattern_11 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
}

/*
 * PATTERN 11 - Binary Triangle (0s and 1s)
 *
 * OUTPUT (n=5):
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 *
 * INTUITION:
 * - Outer loop (i) → controls rows (1 to n)
 * - Inner loop (j) → controls columns (1 to i)
 * - When (i + j) is EVEN → print 1
 * - When (i + j) is ODD  → print 0
 *
 * WHY (i+j) % 2 WORKS:
 * - Row 1 starts at (1+1)=2 → even → 1  (odd row  starts with 1)
 * - Row 2 starts at (2+1)=3 → odd  → 0  (even row starts with 0)
 * - Each next column flips because j increases by 1
 *   even+1 = odd, odd+1 = even → natural alternation
 * 
 * 2        -> 1
 * 3 4      -> 0 1
 * 4 5 6    -> 1 0 1
 * 5 6 7 8  -> 0 1 0 1
 *
 * TIME COMPLEXITY  : O(n^2)
 * SPACE COMPLEXITY : O(1)
 */