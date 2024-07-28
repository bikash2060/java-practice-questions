package OOP.Methods;

public class InstanceMethod {

    static int a = 50;
    static int b = 20;

    //Instance Method: We need to create an object of class to call this method
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        //Creating object and passing arguments as value
        InstanceMethod obj = new InstanceMethod();
        System.out.println(obj.add(a, b));

    }
}
