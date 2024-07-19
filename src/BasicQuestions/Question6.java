package BasicQuestions;
//Write a Java program to print the area and perimeter of a circle.
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = sc.nextDouble();

        double area = 3.14*radius*radius;
        double perimeter = 2*3.14*radius;

        System.out.println("The area of circle is "+area);
        System.out.println("The perimeter of circle is "+perimeter);

    }
}
