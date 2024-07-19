package BasicQuestions;
//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer:");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd integer:");
        int num2 = sc.nextInt();

        System.out.println(num1+" + "+num2+" is "+(num1+num2));
        System.out.println(num1+" * "+num2+" is "+(num1*num2));
        System.out.println(num1+" - "+num2+" is "+(num1-num2));
        System.out.println(num1+" / "+num2+" is "+(num1/num2));
        System.out.println(num1+" % "+num2+" is "+(num1%num2));

    }
}
