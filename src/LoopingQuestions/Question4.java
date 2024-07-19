package LoopingQuestions;
//WAP to display the multiplication table of given integer.
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to display multiplication table:");
        int num = sc.nextInt();
        System.out.println("The multiplication table of "+num+" is:");
        for (int a = 1; a<=10; a++) {
            int result = num*a;
            System.out.println(num+" x "+a+" = "+result);
        }
        sc.close();
    }
}
