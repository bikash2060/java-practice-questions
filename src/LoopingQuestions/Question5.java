package LoopingQuestions;
//WAP that displays the sum of n odd natural numbers.
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms = sc.nextInt();
        int totalSum = 0;
        //Using For-loop
        for (int a = 1; a<=terms; a++){
            int formula = (2*a)-1;
            System.out.println(formula);
            totalSum += formula;
        }
        System.out.println("The sum of "+terms+" odd number is "+totalSum);
    }
}
