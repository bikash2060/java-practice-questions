package OOP.Methods;

public class StaticMethod {

    public static boolean verifyAge(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        if (verifyAge(18)) {
            System.out.println("You are eligible for voting");
        }
        else {
            System.out.println("You are not eligible for voting");
        }
    }
}
