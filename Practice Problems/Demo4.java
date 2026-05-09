package PracticeQuestions;
import java.util.Scanner;
public class Demo4 {
    //WAJP to take in radius as input and returns the circumference of a circle.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle ");
        int r=sc.nextInt();
        int result=circumferenceOfCircle(r);
        System.out.println("Circumference of Circle = "+result);
    }

    public static int circumferenceOfCircle(int r){
        double circum = 0.0;
        circum=2*Math.PI*r; //formula for Circumference of a Circle.
        return (int) circum; //type-casted to int .
    }
}
