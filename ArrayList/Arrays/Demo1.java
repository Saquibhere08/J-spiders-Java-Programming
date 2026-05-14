package Arrays.PracticeQuestions;
import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Array Size: ");
        int size=sc.nextInt();
        int[]arr=new int[size];
        inputArray(arr,sc);
        printArray(arr);
        sumArray(arr);
        avgArray(arr,size);
        largestInArray(arr);
        smallestInArray(arr);
    }
    //Takes the Input
    public static void inputArray(int arr[], Scanner sc){
        System.out.println("Enter the Value to be inserted into the Array");
        for(int  i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    //1.WAJP to print all the elements of an Array
    public static void printArray(int arr[]){
        System.out.println("Array: "+Arrays.toString(arr));
    }
    //2.WAJP to print the Sum of Array Elements
    public static void sumArray(int arr[]){
        int sum=0; //initialised the sum var.
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]; //sum=sum+arr[i]
        }
        System.out.println("Sum of Array Elements: "+sum);
    }

    //3. WAJP to print the Average of the array elements
    public static void avgArray(int arr[],int size){
        int sum=0; //initialised the sum var.
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]; //sum=sum+arr[i]
        }
        double avg=(sum/size);
        System.out.println("Average: "+avg);
    }
    
    //4.WAJP to find the largest number in the Array.
    public static void largestInArray(int arr[]){
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
            largest = arr[i];
            }
        }
        System.out.println("Largest = " + largest);
    }

    //5.WAJP to find the smallest number in the Array
    public static void smallestInArray(int arr[]){
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest = "+smallest);
    }

    //6.WAJP to count even and odd in Array
    public static void countEvenOrOdd(int arr[]){
        int count=0;
        
    }
}
