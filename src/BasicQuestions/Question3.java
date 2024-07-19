package BasicQuestions;
//Write a Java program to divide two numbers and print them on the screen.
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer:");
        double num1 = sc.nextInt();

        System.out.println("Enter 2nd integer:");
        double num2 = sc.nextInt();

        double division = num1/num2;
        System.out.println("The division of "+num1+" and "+num2+" is "+division);

        sc.close();
    }
}
