package BasicQuestions;
//Write a Java program that takes a number as input and prints its multiplication table up to 10.
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to prints its multiplication table:");
        int integer = sc.nextInt();

        for(int a = 1; a<=10; a++){
            int result = integer*a;
            System.out.println(integer+" x "+a+" is "+result);
        }
        sc.close();
    }
}
