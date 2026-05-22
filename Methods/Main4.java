package Methods;
//Methods with no Parameters
public class Main4 {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        System.out.println("Before fun()");
        fun();
        fun();
        System.out.println("After fun()");
        System.out.println("Main Ends");
    }
    public static void fun(){
        System.out.println("Inside fun()");
    }
}
