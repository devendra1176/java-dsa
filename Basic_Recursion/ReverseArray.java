/*

Reverse a given Array

Problem Statement: You are given an array. The task is to reverse the array and print it.
Examples

Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
 
*/
public class ReverseArray {
    public static void reverseArray(int[] arr, int start, int end) {
        // Base case: If start index is greater than or equal to end index, return
        if (start >= end) {
            return;
        }
        
        // Swap the elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        // Recursive call with next indices
        reverseArray(arr, start + 1, end - 1);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int n = arr.length;
        reverseArray(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
