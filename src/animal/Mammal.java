package animal;

public class Mammal extends Animal
{
    private static int maxId;
    private int id;

    public Mammal(String name, int year)
    {
        super(name, year);
        maxId++;
        this.id = maxId;
    }

    public int getId() {
        return id;
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
}
