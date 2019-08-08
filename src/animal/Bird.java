package animal;

public class Bird extends Animal {

    private static int maxId;
    private int id;

    public Bird(String name, int year) {
        super(name, year);
        maxId++;
        this.id = maxId;
    }

    public int getId() {
        return id;
    }

    @Override
    public String move() {
        return "fLy";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}
