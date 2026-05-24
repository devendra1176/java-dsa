/*
Print all Divisors of a given Number

Problem Statement: Given an integer N, return all divisors of N.
A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.
Examples

Input: N = 36
Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]  
Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.


Input: N = 12
Output: [1, 2, 3, 4, 6, 12]
Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12.
            
*/


package Basic_Maths;

public class Divisors {
    public static void main(String[] args) {
        int N = 36;
        for(int i = 1; i <= Math.sqrt(N); i++){
            if(N % i == 0){
                System.out.print(i + " ");
                if(i != N/i){
                    System.out.print(N/i + " ");
                }
            }
        }
    }
}

/* 

* Time Complexity: O(sqrt(N))
* Space Complexity: O(1)

Logic: 
- 1. We iterate from 1 to the square root of N.
- 2. For each integer i, we check if it is a divisor of N by checking if
    N % i == 0.
- 3. If it is a divisor, we print i and also check if it is not the 
    same as N/i to avoid printing the square root twice when N is a 
    perfect square.
    
*/

