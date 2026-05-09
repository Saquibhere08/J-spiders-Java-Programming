package PracticeQuestions;
import java.util.Scanner;
//WAJP to which takes in 2 numbers and returns the greater of those two.
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int n=sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int m=sc.nextInt();

        
        int result=greaterOfTwoNumbers(n, m);
        System.out.println("Greatest Among two is : "+result);

    }
    public static int greaterOfTwoNumbers(int a,int b){
        int greater;
        if(a>b){
            greater=a;
        }else{
            greater = b;
        }
        return greater;

    }
}
