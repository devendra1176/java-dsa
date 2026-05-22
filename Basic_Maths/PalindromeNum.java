//Check if a number is Palindrome or Not

// Problem Statement: Given an integer N, return true if it is a palindrome else return false.

// A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.
// Examples

// Example 1:
// Input:N = 4554
// Output:Palindrome Number
// Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number
                                        
// Example 2:
// Input:N = 7789          
// Output: Not Palindrome
// Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome
            
class Solution {
    public boolean isPalindrome(int N) {
        if(N<0) return false;
        int reverse = 0;
        int original = N;

        while (N > 0) {
            int digit = N % 10;
            reverse = reverse * 10 + digit;
            N /= 10;
        }

        if(original == reverse) return true;
        return false;
    }    
}

public class PalindromeNum {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.err.println("Number 121 is Palindrome: " + obj.isPalindrome(121));
        System.err.println("Number 1331 is Palindrome: " + obj.isPalindrome(1331));
        System.err.println("Number 4554 is Palindrome: " + obj.isPalindrome(4554));
        System.err.println("Number 7789 is Palindrome: " + obj.isPalindrome(7789));
        System.err.println("Number -121 is Palindrome: " + obj.isPalindrome(-121));
        System.err.println("Number 10 is Palindrome: " + obj.isPalindrome(10));
        System.err.println("Number -101 is Palindrome: " +obj.isPalindrome(-101));
    }
}


