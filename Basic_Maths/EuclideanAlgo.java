/* Euclidean Algorithm to find GCD of two numbers
 */

package Basic_Maths;
public class EuclideanAlgo {
    public static void main(String[] args) {
        int a = 42, b = 10;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b)); // Call the gcd method and print the result
    }

    public static int gcd(int a, int b) {
        if (b == 0) { // Base case: if b is 0, GCD is a
            return a; // Return a as the GCD
        }
        return gcd(b, a % b); // Recursive call with b and the remainder of a divided by b
    }
}

/*
Explanation:
1. The main method initializes two integers, a and b, and calls the gcd method to
    compute their GCD, printing the result.

2. The gcd method implements the Euclidean Algorithm:
    - If b is 0, it returns a as the GCD.
    - Otherwise, it recursively calls itself with b and the remainder of a divided by b (a % b).
    - This process continues until b becomes 0, at which point a will be the GCD of the original two numbers.
    - The algorithm is efficient and works in logarithmic time complexity, making it suitable for large integers.
    
    Time Complexity: O(log(min(a, b))) where a and b are the two numbers for which we are finding the GCD.
    Space Complexity: O(1) for the iterative version, O(log(min(a, b))) for the recursive version due to the call stack.

*/