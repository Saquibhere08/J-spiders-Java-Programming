package Arrays;
import java.util.Arrays;
import java.util.Scanner;
/*
WAJP to take an array as input from the user. 
 search for a given number x and prints the index at which it occurs.
*/
public class CodeChallenge1 {

    public static int target;
    public static int n;

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an Array: ");
        n=sc.nextInt();
        
        int arr[]=new int[n]; //inititalization of Array
        //array
        for(int i=0;i<n;i++){            
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        findIndexPrint(arr, sc);
    }


    public static void findIndexPrint(int arr[],Scanner sc){
        target=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("target found at index "+i);
            }
        }
    }
}
