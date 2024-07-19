package LoopingQuestions;
//WAP to display n terms of natural numbers and their sum.
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int terms = sc.nextInt();
        int totalSum = 0;
        for (int a = 1; a<=terms; a++ ){
            System.out.println(a);
            totalSum += a;
        }
        System.out.println("The sum upto "+terms+" is "+totalSum);
        sc.close();
    }
}
