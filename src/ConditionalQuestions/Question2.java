package ConditionalQuestions;
//WAP that takes an integer as input and prints whether it is positive, negative, or zero:

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num1 = sc.nextInt();
        if(num1 > 0){
            System.out.println(num1 + " is positive number.");
        }
        else if(num1 < 0){
            System.out.println(num1 + " is negative number.");
        }
        else{
            System.out.println(num1 + " is zero.");
        }
        sc.close();
    }
}
