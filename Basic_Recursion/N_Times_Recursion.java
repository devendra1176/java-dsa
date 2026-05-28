/*

Print Name N times using Recursion

Problem Description: Given an integer N, write a program to print your name N times.
Examples

Input: N = 3
Output: Ashish Ashish Ashish 
Explanation: Name is printed 3 times.


Input: N = 1
Output: Ashish 
Explanation: Name is printed once.

*/

package Basic_Recursion;

import java.util.Scanner;

class N_Times_Recursion {

    public static void main(String[] args) {

        int N;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value of N: ");
        N = sc.nextInt();

        N_Times_Recursion.printName(1, N);

        sc.close();
    }

    public static void printName(int i, int n) {

        // Base Condition
        if(i > n) {
            return;
        }

        // Kaam
        System.out.println(i + ". Dev");

        // Recursive Call
        printName(i + 1, n);
    }
}