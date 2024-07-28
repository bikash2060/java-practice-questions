package OOP.Methods;

public class StaticMethod {

    //To create static method: Use 'static' keyword right after access modifier
    public static boolean verifyAge(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {

        //No need to mention class name if we are calling static method in the same class
        if (verifyAge(18)) {
            System.out.println("You are eligible for voting");
        }
        else {
            System.out.println("You are not eligible for voting");
        }
    }
}
