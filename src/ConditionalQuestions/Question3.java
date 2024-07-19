package ConditionalQuestions;
//WAP to find the largest among three numbers entered by the user:

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st integer:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd integer:");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd integer:");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater than " + num2 + " and " + num3);
        } else if(num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greater than " + num1 + " and " + num3);
        } else if (num3 > num1 && num3 > num2){
            System.out.println(num3 + " is greater than " + num1 + " and " + num2);
        }
        else {
            System.out.println("All numbers are equals.");
        }
        sc.close();
    }
}