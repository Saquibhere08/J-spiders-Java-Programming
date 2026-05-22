package Methods;
//Non-Static Methods
public class Main3 {
    
    public void printMessage(){
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        Main3 ob=new Main3(); //object created of the class
        ob.printMessage(); //called by ref
    }

}
