package PracticeQuestions;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //1. WAJP to Enter 3 Numbes from User & Make a Function to Print their average.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        calculateAverage(a,b,c);
    }
    
    public static void calculateAverage(int x,int y,int z){
        double avg;
        double count=3.0;
        avg=(x+y+z)/count; //formula for Averages.

        System.out.println("Average of 3 Numbers: "+avg);
    }
}
