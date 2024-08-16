package ExtraQuestion;/* Question: Convert the iterator to list*/

import java.util.ArrayList; // Import the ArrayList class from the util package
import java.util.Iterator; // Import the Iterator interface from the util package
import java.util.List; // Import the List interface from the util package

public class QuestionNo3 { // Define a public class named ExtraQuestion.QuestionNo3

    public static void main(String[] args) { // Main method to execute the program

        Iterator<String> newIterator = List.of("1stelement", "2ndelement", "3rdelement").iterator(); // Create an Iterator from a list with three elements

        List<String> convertedList = convertIteratorToList(newIterator); // Convert the Iterator to a List using the convertIteratorToList method

        System.out.println(convertedList); // Print the converted list to the console

    }
    private static List<String> convertIteratorToList(Iterator<String> iterator) { // Method to convert an Iterator to a list

        List<String> emptyList = new ArrayList<>(); // Create an empty ArrayList to hold the elements
        while (iterator.hasNext()) { // Iterate through the Iterator and add each element to the List
            emptyList.add(iterator.next());
        }
        return emptyList; // Return the converted list
    }
}
