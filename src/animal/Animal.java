package animal;

public abstract class Animal {

    protected String name;
    protected int year;

    public Animal(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();

    @Override
    public String toString()
    {
        return "Name: " + name + ", year: " + year;
    }

}
