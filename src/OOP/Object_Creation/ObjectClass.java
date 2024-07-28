//This class contains all the object of Main class
package OOP.Object_Creation;

public class ObjectClass {
    public static void main(String[] args) {
        Main obj1 = new Main();
        obj1.firstName = "Bikash";
        obj1.lastName = "Bhattarai";
        obj1.age = 18;
        obj1.gender = "Male";

        obj1.displayDetails();
    }
}
