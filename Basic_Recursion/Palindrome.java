/*
Check if the given String is Palindrome or not

Problem Statement: Given a string, check if the string is palindrome or not. A string is said to be palindrome if the reverse of the string is the same as the string.
Examples

Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.

Example 2:
Input: Str = “TAKE U FORWARD”
Output: Not Palindrome
Explanation: String when reversed is not the same as string.
*/

public class Palindrome {
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: If start index is greater than or equal to end index, return true
        if (start >= end) {
            return true;
        }
        
        // Check if characters at start and end indices are the same
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        
        // Recursive call with next indices
        return isPalindrome(str, start + 1, end - 1);
    }
    
    public static void main(String[] args) {
        String str = "ABCDCBA";
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str+" is a Palindrome");
        } else {
            System.out.println(str+" is not a Palindrome");
        }
    }
}
