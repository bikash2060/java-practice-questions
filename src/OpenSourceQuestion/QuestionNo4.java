package OpenSourceQuestion; // Question: Print "Hello World" in Java without using a semicolon.

public class QuestionNo4 { // Define a public class named QuestionNo4
    public static void main(String[] args) { // Main method to execute the program

        // Use the printf method of System.out to print "Hello World"
        // The printf method returns a PrintStream, and we compare it with null to avoid using a semicolon
        if(System.out.printf("Hello World").equals(null)){
            // This block is intentionally left empty
        }
    }
}
