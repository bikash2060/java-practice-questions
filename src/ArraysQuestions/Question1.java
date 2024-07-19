package ArraysQuestions;
//WAP that takes integer values from user and store them in an array and print them out.
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int length = sc.nextInt();
        int[] emptyArray = new int[length];
        for(int a = 0; a<length; a++){
            System.out.println("Enter an element: ");
            int element = sc.nextInt();
            emptyArray[a] = element;
        }
        for (int array: emptyArray){
            System.out.print(array+" ");

        }
        sc.close();
    }
}
