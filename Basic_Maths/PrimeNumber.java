package Basic_Maths;

/*
You are given an integer n. You need to check if the number is prime or not.
Return true if it is a prime number, otherwise return false.


A prime number is a number which has no divisors except 1 and itself.

Example 1
Input: n = 5
Output: true
Explanation: The only divisors of 5 are 1 and 5 , So the number 5 is prime.

Example 2
Input: n = 8
Output: false
Explanation: The divisors of 8 are 1, 2, 4, 8, thus it is not a prime number.

*/

public class PrimeNumber {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // num is divisible by a number other than 1 and itself
            }
        }
        return true; // num is a prime number
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        System.out.println(num1 + " is prime: " + isPrime(num1));
        System.out.println(num2 + " is prime: " + isPrime(num2));
    } 
}


// * Time Complexity: O(sqrt(num))
// * Space Complexity: O(1)

/* 

Logic:
- 1. We first check if num is less than or equal to 1, in
    which case we return false since 0 and 1 are not prime numbers.
- 2. We then iterate from 2 to the square root of num. If num is divisible
    by any of these numbers, it means num has a divisor other than 1 and itself
    and we return false.
- 3. If we finish the loop without finding any divisors, we return true,
    indicating that num  is a prime number.

*/
