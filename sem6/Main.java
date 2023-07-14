package sem6;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat("Barsik", 3, "gray"));
        cats.add(new Cat("Murzik", 4, "white"));
        cats.add(new Cat("Murzik", 4, "white"));

        for (Cat cat : cats) {
            System.out.println(cat.getName());
            System.out.println(cat.getAge());
            System.out.println(cat.getColor());
        }
    }
}
