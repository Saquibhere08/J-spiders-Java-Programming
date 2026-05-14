package Arrays.PracticeQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class CodeChallenge2 {
    public static void main(String[] args) {
        /*WAJP to take a input matrix from the user. Search for a given
        number x and print the indices at which the x is located.
        */
       Scanner sc=new Scanner(System.in);
       System.out.print("Row: ");
       int row=sc.nextInt();
       System.out.print("Column: ");
       int col=sc.nextInt();
       int [][] arr=new int[row][col]; //array 2D initialization
       inputArr(sc,arr);
       
       System.out.println("Enter the target Number: ");
       int target=sc.nextInt();
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(arr[i][j]==target){
                System.out.println("("+i+","+j+")");
            }
        }
       }
    }

    public static void inputArr(Scanner sc,int arr[][]){
        System.out.println("Enter the Elements of Array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
