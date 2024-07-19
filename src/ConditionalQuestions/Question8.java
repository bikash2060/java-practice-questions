package ConditionalQuestions;
/*
Write a Java program that takes a character as input and prints whether it is a vowel or a consonant.
If it is neither, it should print an error message.
 */
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char character = sc.next().charAt(0);
        character = Character.toLowerCase(character);//Convert the character to lowercase:

        char[]  vowels = {'a','e','i','o','u'};//Creating arrays of character to store vowels words:
        boolean match = false;
        for (char vowel : vowels) {
            if (character == vowel) {
                match = true;
                break;
            }
        }
        //Applying condition whether it is vowels, consonant or numbers:
        if (match) {
            System.out.println(character+" is vowel word.");
        }
        else if (Character.isDigit(character)){
            System.out.println(character+" is number.");
        }
        else {
            System.out.println(character+" is consonant.");
        }
        sc.close();
    }
}