package animal;

import java.util.*;

public class Main {
    public static void printAnimals(ArrayList<Animal> animals) {

    }

    public static void main(String[] args) {

        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

        System.out.println("*** List all the animals in descending order by year named ***");
        animals.sort((a1, a2) -> Integer.compare(a2.getYear(), a1.getYear()));
        System.out.println(animals.toString());
        System.out.println();
        System.out.println("*** List all Animals alphabetically ***");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animals.toString());
        System.out.println();
        System.out.println("*** List all the animals order by how they move ***");
        animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(animals.toString());
        System.out.println();
        System.out.println("*** List only those animals that breath with lungs ***");
        animals.forEach(a -> {
            if (a.breath().equals("lungs")) {
                System.out.println(a.toString());
            }
        });
        System.out.println();
        System.out.println("*** List only those animals that breath with lungs and were named in 1758 ***");
        animals.forEach(a-> {
            if (a.breath().equals("lungs") && a.getYear() == 1758) {
                System.out.println(a.toString());
            }
        });
        System.out.println();
        System.out.println("*** List only those animals that lay eggs and breath with lungs ***");
        animals.forEach(a->{
           if (a.breath().equals("lungs") && a.reproduce().equals("eggs")) {
               System.out.println(a.toString());
           }
        });
        System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
        ArrayList<Animal> sortedList = new ArrayList<Animal>();
        animals.forEach(a-> {
            if (a.getYear() == 1758) {
                sortedList.add(a);
            }
        });
        sortedList.sort((s1,s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
        System.out.println(sortedList.toString());

        System.out.println();
        System.out.println("*** For the list of animals, list alphabetically those animals that are mammals. ***");
        ArrayList<Animal> stretchList = new ArrayList<Animal>();
        animals.forEach(a-> {
            if (a.move().equals("walk")) {
                stretchList.add(a);
            }
        });
        stretchList.sort((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
        System.out.println(stretchList.toString());
    }
}
