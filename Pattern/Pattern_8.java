/*
Given an integer n. You need to recreate the pattern given below for any value of N. 
Let's say for N = 5, the pattern should look like as below:

*********
 *******
  *****
   ***
    *
    * 
*/

public class Pattern_8 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*(n-i)+1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


/*
pattern solution intuition: 
Row 1 → [0 spaces] + [9 stars] = *********
Row 2 → [1 space]  + [7 stars] =  *******
Row 3 → [2 spaces] + [5 stars] =   *****
Row 4 → [3 spaces] + [3 stars] =    ***
Row 5 → [4 spaces] + [1 star]  =     *
*/