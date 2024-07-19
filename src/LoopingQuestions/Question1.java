package LoopingQuestions;
//WAP that takes a number from the user check whether it is prime number or not.
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = sc.nextInt();
        int divisionCount = 0;

        for(int a = 1; a<number+1; a++){
            if (number%a == 0)
            {
                divisionCount += 1;
            }
        }
        if (divisionCount == 2) {
            System.out.println(number+" is prime number.");
        }
        else {
            System.out.println(number+" is composite number.");
        }
    }
}
