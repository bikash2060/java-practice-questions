package OpenSourceQuestion; // Define the package for the class

import java.util.LinkedList; // Import the LinkedList class from the util package

public class QuestionNo7 { // Define a public class named QuestionNo7

    public static void main(String[] args) { // Main method to execute the program

        // Call the method to generate numbers using an array
        int[] array = generateNumbersUsingArray();
        System.out.println("Printing elements of Array:"); // Print a message indicating the following output is from the array

        // Print each element of the array
        for (int integer : array) {
            System.out.print(integer + " ");
        }
        System.out.println(); // Print a newline for separation

        // Call the method to generate numbers using a LinkedList
        LinkedList<Integer> linkedList = generateNumbersUsingLinkedList();
        System.out.println("Printing elements of LinkedList:"); // Print a message indicating the following output is from the LinkedList

        // Print each element of the LinkedList
        for (int integer : linkedList) {
            System.out.print(integer + " ");
        }

    }

    // Method to generate numbers from 1 to 100 using an array
    private static int[] generateNumbersUsingArray() {
        int[] integers = new int[100]; // Create an array with a size of 100

        // Initialize the array with values from 1 to 100
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i + 1;
        }

        // Return the populated array
        return integers;
    }

    // Method to generate numbers from 1 to 100 using a LinkedList
    private static LinkedList<Integer> generateNumbersUsingLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>(); // Create a new LinkedList to hold the numbers

        // Add numbers from 1 to 100 to the LinkedList
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        // Return the populated LinkedList
        return numbers;
    }
}
