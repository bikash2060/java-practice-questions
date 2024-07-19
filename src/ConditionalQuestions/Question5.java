package ConditionalQuestions;
/*
Write a Java program to determine the grade of a student based on his/her marks.
The program should take marks as input and print the corresponding grade according to the following criteria:
1. 90 or above: A
2. 80-80: B
3. 70-79: C
4. 60-69: D
5. Below 60: F
*/
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Computer:");
        double comp = sc.nextDouble();

        System.out.println("Enter marks of English:");
        double eng = sc.nextDouble();

        System.out.println("Enter marks of Math:");
        double math = sc.nextDouble();

        System.out.println("Enter marks of Chemistry:");
        double chem = sc.nextDouble();

        System.out.println("Enter marks of Physics:");
        double phy = sc.nextDouble();

        double totalMarks = comp+eng+math+chem+phy;
        double percentage = (totalMarks * 100) / 500;

        if (percentage >= 90) {
            System.out.println("Your grade is A with "+percentage+" percentage.");
        } else if (percentage >= 80) {
            System.out.println("Your grade is B with "+percentage+" percentage.");
        } else if (percentage >= 70) {
            System.out.println("Your grade is C with "+percentage+" percentage.");
        } else if (percentage >= 60) {
            System.out.println("Your grade is D with "+percentage+" percentage.");
        }
        else {
            System.out.println("Your grade is F with "+percentage+" percentage.");
        }
        sc.close();
    }
}
