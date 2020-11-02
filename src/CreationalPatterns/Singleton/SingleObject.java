package CreationalPatterns.Singleton;

public class SingleObject {

    private static SingleObject instance = new SingleObject(); //static instance of self

    private SingleObject() {} //private constructor

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Message");
    }
}
