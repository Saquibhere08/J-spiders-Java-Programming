package PracticeQuestions;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        //WAJP to take age as input and if that person is >18 then he/she is eligible to vote.
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age=sc.nextInt();

        checkAge(age);
    }
    public static void checkAge(int age){
        if(age>=18){
            System.out.println("You are Eligible to Vote");
        }else
            System.out.println("You are not Eligible.");
    }
}
