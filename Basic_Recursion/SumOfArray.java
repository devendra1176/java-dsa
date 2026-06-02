/*
Given an array of integers, find sum of array elements using recursion. 

Examples: 

    Input: arr = [1, 2, 3]
    Output: 6
    Explanation: 1 + 2 + 3 = 6

    Input: arr = [15, 12, 13, 10]
    Output: 50
    Explanation: 15 + 12 + 13 + 10 = 50

*/

public class SumOfArray {
    public static int sumOfArray(int[] arr, int index) {
        // Base case: If index is out of bounds, return 0
        if (index >= arr.length) {
            return 0;
        }

        // Recursive call with the next index and add the current element to the result
        return arr[index] + sumOfArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; 
        int result = sumOfArray(arr, 0);
        System.out.println("Sum of array elements: " + result); // Output: 21
    }
}
