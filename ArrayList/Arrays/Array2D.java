package Arrays.PracticeQuestions;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        inputOutputArray(sc);
    }

    public static void inputOutputArray(Scanner sc){
        System.out.println("Rows: ");
         int row=sc.nextInt();
         System.out.println("COlumns: ");
        int col=sc.nextInt();
        //2D Array Declaration
        int [][] num=new int[row][col];
        System.out.println("Enter the elements in 2D Array");
        System.out.println("In the format of Rows and COlumns");

        for(int i=0;i<row;i++){ //input
            for(int j=0;j<col;j++){
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D Array ");
         for(int i=0;i<row;i++){ //output
            for(int j=0;j<col;j++){
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
        
    }

}
