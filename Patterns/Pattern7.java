package patterns;
public class Pattern7 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				//space
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				//star
				System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++) {
				//space
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}
}
/*
 7.Given an integer n. 
 You need to recreate the pattern given below for any value of N.
Let's say for N = 5, the pattern should look like as below:

    *
   ***
  *****
 *******
*********
 */
