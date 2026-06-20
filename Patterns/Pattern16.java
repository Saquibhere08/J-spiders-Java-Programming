package patterns;
public class Pattern16 {
	public static void main(String[] args) {
		int n=5;
		int ascii=65;
		char ch=(char) ascii;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            ch+=1;
            System.out.println();
        }
	}
}
/*
 16.Given an integer n. 
 You need to recreate the pattern given below for any value of N. 
 Let's say for N = 5, the pattern should look like as below:
A
BB
CCC
DDDD
EEEEE

 */
