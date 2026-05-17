package Arrays.PracticeQuestions;

public class Geeks{
    public static void main(String[] args){
      
        // declares an Array of Student
        ObjectinArrays[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new ObjectinArrays[5];

        // initialize the elements of the array
        arr[0] = new ObjectinArrays(1, "aman");
        arr[1] = new ObjectinArrays(2, "vaibhav");
        arr[2] = new ObjectinArrays(3, "shikar");
        arr[3] = new ObjectinArrays(4, "dharmesh");
        arr[4] = new ObjectinArrays(5, "mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { "
                               + arr[i].roll_no + " "
                               + arr[i].name+" }");
    }
}
