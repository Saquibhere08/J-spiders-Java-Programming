package patterns;
public class Pattern8 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				//space
				System.out.print(" ");
			}
			for(int j=0;j<2*n-(2*i+1);j++) {
				//star
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				//space
				System.out.print(" ");
			}
			System.out.println();

		}

	}
}
/*
 8.Given an integer n. 
 You need to recreate the pattern given below for any value of N. 
 Let's say for N = 5, the pattern should look like as below:

*********
 *******
  *****
   ***
    *

 */
