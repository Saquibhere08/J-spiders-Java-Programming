package patterns;
public class Pattern15 {
	public static void main(String[] args) {
		int n=5;
		int ascii=65;
        for(int i=n;i>0;i--){
            char ch=(char) ascii;
            for(int j=0;j<i;j++){
                System.out.print(ch);
                ch+=1;
            }
            System.out.println();
        }
	}
}
/*
 15.Given an integer n. 
 You need to recreate the pattern given below for any value of N.
  Let's say for N = 5, the pattern should look like as below:
  
ABCDE
ABCD
ABC
AB
A

 */
