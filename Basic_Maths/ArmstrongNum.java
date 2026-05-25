package Basic_Maths;
// Check if a number is an Armstrong Number or Not

// Problem Statement: Given an integer N, return true if it is an Armstrong number else return false.

// An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
// Examples

// Example 1:
// Input:N = 153
// Output:Armstrong Number
// Explanation: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

// Example 2:
// Input:N = 123          
// Output: Not Armstrong
// Explanation: 1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36 ≠ 123

public class ArmstrongNum {
    public static boolean isArmstrong(int N) {
        int original = N;
        int sum = 0;
        int digits = String.valueOf(N).length();

        while (N > 0) {
            int digit = N % 10;
            sum += Math.pow(digit, digits);
            N /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println("Number 153 is Armstrong: " + isArmstrong(153));
        System.out.println("Number 123 is Armstrong: " + isArmstrong(123));
        System.out.println("Number 9474 is Armstrong: " + isArmstrong(9474));
        System.out.println("Number 9475 is Armstrong: " + isArmstrong(9475));
    }
}