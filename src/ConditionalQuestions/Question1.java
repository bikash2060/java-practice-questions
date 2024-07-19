package ConditionalQuestions;
//WAP that takes an integer as input and prints whether it is even or odd

import java.util.Scanner;// Importing scanner class from utility package to take input from user
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Creating object of scanner class to use built-in methods
        System.out.println("Enter an integer: ");// Asking the user to enter an integer
        int num1 = sc.nextInt();// Taking input from user and storing it in the variable num1
        if(num1 % 2 == 0) {
            System.out.println(num1 + " is even number.");
        }
        else {
            System.out.println(num1 + " is odd number.");
        }
        sc.close();// Closing the Scanner object to release system resources
    }
}

