package ArraysQuestions;
/*WAP that takes element from user and store them in an array.
Then ask again and check whether it is present in an array or not.*/
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array:");
        int length = sc.nextInt();
        int[] emptyArray = new int[length];
        for (int a = 0; a<emptyArray.length; a++) {
            System.out.println("Enter an element: ");
            int element = sc.nextInt();
            emptyArray[a] = element;
        }
        for (int arrays: emptyArray) {
            System.out.println("Enter an integer to check whether it is present in array or not:");
            int integer = sc.nextInt();
            if (integer == arrays) {
                System.out.println("Matched");
                break;
            }
            else {
                System.out.println("New element hurray");
                break;
            }
        }
    }
}
