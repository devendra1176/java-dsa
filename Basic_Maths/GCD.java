package Basic_Maths;
/*
Find GCD of two numbers

Problem Statement: Given two integers N1 and N2, find their greatest common divisor.
Examples

Example 1:
Input: N1 = 9, N2 = 12

Output: 3
Explanation:
Factors of 9: 1, 3, 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3
Greatest common factor: 3 (GCD)

Example 2:
Input: N1 = 20, N2 = 15

Output: 5
Explanation:
Factors of 20: 1, 2, 4, 5, 10, 20
Factors of 15: 1, 3, 5, 15
Common Factors: 1, 5
Greatest common factor: 5 (GCD)
*/

public class GCD {
    public static void main(String[] args) {
        int N1 = 9, N2 = 12;
        System.out.println("GCD of " + N1 + " and " + N2 + " is: " + findGCD(N1, N2));
    }

    // private static int findGCD(int N1, int N2) {
    //     if (N2 == 0) {
    //         return N1;
    //     }
    //     return findGCD(N2, N1 % N2);
    // }
    // Iterative approach
    // private static int findGCD(int N1, int N2) {
    //     while (N2 != 0) {
    //         int temp = N2;
    //         N2 = N1 % N2;
    //         N1 = temp;
    //     }
    //     return N1;
    // }   

    // Brute force approach
    // private static int findGCD(int N1, int N2) {
    //     int gcd = 1;
    //     for (int i = 1; i <= Math.min(N1, N2); i++) {
    //         if (N1 % i == 0 && N2 % i == 0) {
    //             gcd = i;
    //         }
    //     }
    //     return gcd;
    // }

    // Optimized approach
    private static int findGCD(int N1, int N2) {
        int gcd = 1;
        for (int i = 1; i <= Math.sqrt(Math.min(N1, N2)); i++) {
            if (N1 % i == 0 && N2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
