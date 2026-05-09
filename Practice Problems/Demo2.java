package PracticeQuestions;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //WAJP for a function to print the sum of all odd number from 1 to N.
        Scanner sc =new Scanner(System.in);
        System.out.println("Checking sum of all odd number from 1 to N");
        System.out.println("Enter the Value for N: ");
        int N=sc.nextInt();
        sumOfOddNumbers(N);
    }
    public static void sumOfOddNumbers(int N){
        int sum=0;
        for(int i=1;i<N;i++){
            if(i%2!=0){ //checking for Odd numbers
                sum+=i; //sum = sum+i;
                System.out.println(i+ " - "+sum);
            }
        }
        System.out.println("Total Sum: "+sum);
    }
}
