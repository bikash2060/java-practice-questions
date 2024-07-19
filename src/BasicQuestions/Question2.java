package BasicQuestions;
//Write a Java program to print the sum of two numbers.

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer:");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd integer:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);

        sc.close();
    }
}
