package Methods;
//Methods with no Parameters
public class Main5 {
    public static void main(String[] args) {
        System.out.println("Main Begins");
        fun1();
        System.out.println("Main Ends");
        fun();
        fun();
    }
    public static void fun(){
        int x=5,y=10;
        System.out.println(x+y);
    }
    public static void fun1(){
        System.out.println("fun1() starts");
        fun2();
        System.out.println("fun1() ends");
    }
    public static void fun2(){
        System.out.println("Inside fun2()");
    }   
}
