package patterns;
public class Pattern10 {
	public static void main(String[] args) {
		int n=5;		
		
		for(int i=0;i<n;i++) {
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		for(int i=n;i>0;i--) {
			for(int j=0;j<i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}

}

/*
 10.Given an integer n.
  You need to recreate the pattern given below for any value of N. 
  Let's say for N = 5, the pattern should look like as below:

*
**
***
****
*****
****
***
**
*

 */
