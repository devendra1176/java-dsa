/*
Print N to 1 using Recursion

Subscribe to TUF+

Given an integer n, write a function to print all numbers from n to 1 (inclusive) using recursion.

    You must not use any loops such as for, while, or do-while.
    The function should print each number on a separate line, in decreasing order from n to 1

Example 1

Input: 5

Output:

5

4

3

2

1

 */
public class Print_N_to_1 {
    public static void printNTo1(int n) {
        // Base case: If n is less than 1, return
        if (n < 1) {
            return;
        }

        // Print the current number
        System.out.println(n);

        // Recursive call with n decremented by 1
        printNTo1(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        printNTo1(n);
    }
}
