package Methods;
public class Main2 {
    //Static Parameterized Methods
    public static void main(String[] args) {
        sumOfTwoNumbers(3, 55);
        printName("Saquib", "Nazeeb");
        int result=productOfTwoNumbers(34, 66);
        System.out.println("Product of Two Numbers: "+result);
    }

    public static void printName(String name1, String name2){
        System.out.println(name1);
        System.out.println(name2);

    }

    public static void sumOfTwoNumbers(int a,int b){
        int sum;
        sum=a+b;
        System.out.println(sum);
    }

    public static int productOfTwoNumbers(int a,int b){
        int prod;
        prod=a*b;

        return prod; //since the returnType is int, so we need to use return keyword to return back the value/variable etc.
    }


}
