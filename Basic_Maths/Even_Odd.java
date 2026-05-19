/*
The number will have no leading zeroes, except when the number is 0 itself.

Example 1

Input: n = 5

Output: 1

Explanation: 5 is an odd digit.

Example 2

Input: n = 25

Output: 1

*/

package Basic_Maths;

public class Even_Odd {
    public static void main(String[] args) {
        int n = 25;
        if(n % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
