package LoopingQuestions;
//WAP to display the first 10 natural numbers and their sum.
public class Question2 {
    public static void main(String[] args) {
        int totalSum = 0;
        for (int a = 1; a<=10; a++) {
            System.out.println(a);
            totalSum += a;
        }
        System.out.println("The sum of first 10 natural number is "+totalSum);
    }
}
