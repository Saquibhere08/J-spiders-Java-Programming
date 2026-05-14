package Arrays;
import java.util.Arrays;
import java.util.Scanner;
//Ways to declare an Array in Java
public class ArrayDemo {
    public static int n;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        n=sc.nextInt();
        int [] arr=new int[n]; //initialization of an array
       
        arrPrint1(arr);
        arrPrint2(arr, sc);
        
    }
    //Method 1: Directly Accessing the Array
    public static void arrPrint1(int arr[]){
        if(n>=4){
             arr[0]=99;        
        arr[1]=93;        
        arr[2]=95;        
        arr[3]=94;        
     
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        }else
            System.out.println("Entered Size should be atleast 4");
       

    }
    //Method 2: Using For Loop & UserInput
    public static void arrPrint2(int arr[], Scanner sc){
        System.out.println("Enter the Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }                
        System.out.println(Arrays.toString(arr));
    }
    
}
