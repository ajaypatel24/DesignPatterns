package OOP;

public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog();

        dog.setName("Dog"); 
        
        Giraffe gir = new Giraffe();
        gir.setName("Bobet");
        System.out.println(gir.getName());
        //"Dog" = arguement
        //do not use dog.name = "Dog"
        //encapsulation protects the data from outside

        //instance variable is declared inside a class, called field
        //local variables are created inside of methods


        //Inheritance
        //avoid duplicate code, reflect changes right away


        //when you pass a value to a method
        
    }

    //static methods are not tied to an object
    //does change name, reference to object being passed, changes object across all of code
    //pass by value does not do this


    //abstract class and interface give power of polymorphism without extra work
    //no abstract fields, all methods do not have to be abstract 
    //in interface everything needs to be abstract 
    //abstract classes can have static methods
    //
    public static void changeObjName(Dog fido) {
        fido.setName("Marcus");
    }
}
