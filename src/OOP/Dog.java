package OOP;

public class Dog extends Animal {
    
    public void dig() {
        System.out.println("digging");
    }

    public Dog() {
        super();
        setSound("bark");
    };
}
