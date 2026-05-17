package Arrays.PracticeQuestions;
import java.util.Arrays;
import java.util.Scanner;
// 1D - Array Problems
public class MainFile {
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
        countEven(arr);
        countOdd(arr);
        linearSearchArr(arr,sc);
        reverseArray(arr,sc);
        copyArray(arr, sc);
        ascArr(arr);
        descArr(arr);
        secLargest(arr);
    }
    //Takes the Input
    public static void inputArray(int arr[], Scanner sc){
        System.out.println("Enter the Value to be inserted into the Array");
        for(int  i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
    }
    //1.WAJP to print all the elements of an Array
    public static void printArray(int arr[]){
        System.out.println("1. Print All the Elements of an Array");
        System.out.println("Array: "+Arrays.toString(arr));
        System.out.println();

    }
    //2.WAJP to print the Sum of Array Elements
    public static void sumArray(int arr[]){
        System.out.println("2.Prints the Sum of Array Element");
        int sum=0; //initialised the sum var.
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]; //sum=sum+arr[i]
        }
        System.out.println("Sum of Array Elements: "+sum);
        System.out.println();

    }

    //3. WAJP to print the Average of the array elements
    public static void avgArray(int arr[],int size){
        System.out.println("3.Average of Array Elements");
        int sum=0; //initialised the sum var.
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]; //sum=sum+arr[i]
        }
        double avg=(sum/size);
        System.out.println("Average: "+avg);
        System.out.println();

    }
    
    //4.WAJP to find the largest number in the Array.
    public static void largestInArray(int arr[]){
        System.out.println("4.Largest Value in Array");
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
            largest = arr[i];
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println();

    }

    //5.WAJP to find the smallest number in the Array
    public static void smallestInArray(int arr[]){
        System.out.println("5.Smallest Value in Array");
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest = "+smallest);
        System.out.println();

    }

    //6.WAJP Count even and odd numbers in an array.
    public static void countEven(int arr[]){
        System.out.println("6.Count even or odd in Array Elements");
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("Count for Even Numbers: "+count);
        System.out.println();

    }
     public static void countOdd(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        System.out.println("Count for Odd Numbers: "+count);
        System.out.println();

    }

    //7.Search for an element using linear search
    public static void linearSearchArr(int []arr,Scanner sc){
        System.out.println("7.Perform Linear Search on the Array and Search for an Element");
        System.out.println("Enter Target Value: ");
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(arr[i]+" : index "+i+" ");
            }
        }
        System.out.println();

    }

    //8.Reverse an array
    public static void reverseArray(int arr[],Scanner sc){
        System.out.println("8.Reverse an Array");
        System.out.println("Array: "+Arrays.toString(arr));
        for(int i = 0; i < arr.length / 2; i++){
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
    }
        System.out.println("Reversed Array: "+Arrays.toString(arr));
        System.out.println();

    }

    //9.Copy one array into another array
    public static void copyArray(int arr[],Scanner sc){
        System.out.println("9.Copy one array into another array");
        int a[]=new int[arr.length]; //new array

        for(int i=0;i<arr.length;i++){
            a[i]=arr[i];
        }
        System.out.println("Old Array: "+Arrays.toString(arr));
        System.out.println("New Array: "+Arrays.toString(a));
        System.out.println();


    }
    //10.Sort an array in ascending order.
    public static void ascArr(int arr[]){
        System.out.println("10.Sort an array in ascending order.");
        System.out.println("Unsorted Array: "+Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
           }
        }
        System.out.println("Sorted Array(ascending-order): "+Arrays.toString(arr)); //sorted array in ascending order       
        System.out.println();
        
    }
    
    //11.Sort an Array in Descending Order.
    public static void descArr(int arr[]){
        System.out.println("11.Sort an Array in Descending Order.");
        for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-1;j++){
            if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
           }
        }
        System.out.println("Sorted Array(descending-order): "+Arrays.toString(arr));
        System.out.println();

    }

    //12.Find the second largest element.
    public static void secLargest(int arr[]) {
        System.out.println();
        int largest = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>arr[arr[j+1]]){
                largest=arr[j];
            }
        }
        System.out.println("12.Find the second largest element.");
        for(int i=0;i<arr.length;i++){
            if(arr[i]<largest && arr[i]>arr[i+1]){
                System.out.println(arr[i]+ " ");
            } //not sure it will run or not
        }
    }
}
