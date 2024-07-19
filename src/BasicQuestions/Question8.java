package BasicQuestions;
//Write a Java program to swap two variables.
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();

        System.out.println("Before swapping:");
        System.out.println("1st number "+num1);
        System.out.println("2nd number "+num2);

        //Swapping two numbers using third variables:
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Before swapping:");
        System.out.println("1st number "+num1);
        System.out.println("2nd number "+num2);

    }
}
