package Arrays.PracticeQuestions;
public class OperationsInArray {
    public static void main(String[] args) {
        operation1();
        operation2();
        operation3();
        operation4();
        operation5(); //gives error : ArrayIndexOutOfBounds Exception
        operation6();
    }

    public static void operation1() {
        System.out.println();
        System.out.println("//Operations1: Access an array Element");
        int arr[] = { 2, 4, 8, 12, 16 };

        // Accessing fourth element
        System.out.print(arr[3] + " ");

        // Accessing first element
        System.out.print(arr[0]);
        System.out.println();

    }

    public static void operation2() {
        System.out.println();

        System.out.println("//Operation2: Update an array element");
        int[] arr = { 2, 4, 8, 12, 16 };
        // Updating first element
        arr[0] = 90;
        System.out.println(arr[0]);
    }

    public static void operation3() {
        System.out.println();

        System.out.println("//Operation3: Traverse an array");
        int[] arr = { 2, 4, 8, 12, 16 };

        // Traversing and printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void operation4() {
        System.out.println();

        System.out.println("//Operation4: Size an Array");
        int[] arr = { 2, 4, 8, 12, 16 };
        System.out.println("Size of array: " + arr.length);
    }

    public static void operation5() {
        System.out.println();

        System.out.println("//Operation5: Accessing an element outside the array");
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        System.out.println(
                "Trying to access element outside the size of array");
        try{
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Exception Handled...");
        }
    }
    public static int[] operation6(){
        System.out.println();

        System.out.println("//Operation6: Returning Arrays from Methods");
        return new int[] {1,2,3,4,5,6};
    }
}
