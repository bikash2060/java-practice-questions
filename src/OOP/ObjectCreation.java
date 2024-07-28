// This program demonstrates creating an object and assigning values to its instance variables
package OOP;

public class ObjectCreation {

    //Instance Variable
    String name;
    int age;
    String address;

    public static void main(String[] args) {

        //Instance of class
        ObjectCreation obj1 = new ObjectCreation();
        obj1.name = "John";
        obj1.age = 18;
        obj1.address = "123 Main St";
        System.out.println(obj1.name+" "+obj1.age+" "+obj1.address);

    }
}
