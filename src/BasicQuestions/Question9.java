package BasicQuestions;
//Write a Java program to compare two numbers.
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println(num1+" == "+num2);
        }
        if (num1 != num2) {
            System.out.println(num1+" != "+num2);
        }
        if (num1 > num2) {
            System.out.println(num1+" > "+num2);
        }
        if (num1 < num2) {
            System.out.println(num1+" < "+num2);
        }
        if (num1 >= num2) {
            System.out.println(num1+" >= "+num2);
        }
        if (num1 <= num2) {
            System.out.println(num1+" <= "+num2);
        }
        sc.close();
    }
}
