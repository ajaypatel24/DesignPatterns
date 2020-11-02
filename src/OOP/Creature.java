package OOP;

abstract public class Creature { // cannot be instantiated
    //protected fields are like private fields, cannot be inherited


    protected String name;
    protected int weight;
    protected String sound;

    public abstract void setName(String newName);
    public abstract String getName();

    public abstract void setWeight(double newWeight);
    public abstract void getWeight();

}
