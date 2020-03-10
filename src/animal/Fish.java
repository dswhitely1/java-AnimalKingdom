package animal;

public class Fish extends Animal
{
    private static int maxId;
    private int id;

    public Fish(String name, int year) {
        super(name, year);
        maxId++;
        this.id = maxId;
    }

    public int getId() {
        return id;
    }

    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String breath() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}
