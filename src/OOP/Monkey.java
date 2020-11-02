package OOP;

public class Monkey implements Living {

    private String name;
    @Override
    public void setName(String newName) {
        name = newName;

    }

    @Override
    public String getName() {
        return name;
    }
    
}