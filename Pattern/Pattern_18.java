/*
Given an integer n. You need to recreate the pattern given below for any value of N. 
Let's say for N = 5, the pattern should look like as below:


E 
D E 
C D E 
B C D E 
A B C D E 
*/
public class Pattern_18 {
    public static void main(String[] args) {
        int n = 5;
        for(char i=1;i<=n;i++){ 
            
            for(int j=i;j>=1;j--){
                System.out.print((char)((65+n)-j)+" ");
            }
           
        System.out.println("");
        }
    }

}
