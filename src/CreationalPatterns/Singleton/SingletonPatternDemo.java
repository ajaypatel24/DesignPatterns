package CreationalPatterns.Singleton;

public class SingletonPatternDemo {
    public static void main (String[] args) {
        //SingleObject is not visible
        //SingleObject object = new SingleObject()

        //get instance
        SingleObject singObj = SingleObject.getInstance();

        singObj.showMessage();
    }
}
