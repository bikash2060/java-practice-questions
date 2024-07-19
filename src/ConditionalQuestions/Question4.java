package ConditionalQuestions;
//Write a Java program that takes the age of a person as input and prints whether the person is eligible to vote or not.

import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}

