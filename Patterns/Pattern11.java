package patterns;
public class Pattern11 {
public static void main(String[] args) {
	int n=5;
	int print=1;
	for(int i=0;i<n;i++){
		if(i%2==0) {
			print=1;
		}else
			print=0;
        for(int j=0;j<=i;j++){
        		System.out.print(print);
        		print=1-print;
        }
        System.out.println();
    }
}
}
/*
 11.Given an integer n. 
 You need to recreate the pattern given below for any value of N. 
 Let's say for N = 5, the pattern should look like as below:

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1
 */
