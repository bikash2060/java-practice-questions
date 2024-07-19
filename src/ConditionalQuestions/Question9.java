package ConditionalQuestions;
//WAP to convert given days into year, month, and days.
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int days = sc.nextInt();

        int years = days/365;
        int remainingDays = days%365;

        int months = remainingDays/30;
        int totalDays = remainingDays%30;

        System.out.println(years+" Years "+months+" Months "+totalDays+" Days");

        sc.close();
    }
}
