// Given an integer n. You need to recreate the pattern given below for any value of N. 
// Let's say for N = 5, the pattern should look like as below:

// *****
// ****
// ***
// **
// *

public class Pattern_5 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
