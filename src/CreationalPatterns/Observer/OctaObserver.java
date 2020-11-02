package CreationalPatterns.Observer;

public class OctaObserver extends Observer {
    
    public OctaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toOctalString(subject.getState()));

    }

    
}