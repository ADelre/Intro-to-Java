package Examples.classes;

import Examples.classes.Animal;

public class Classes {

    public static void main(String[] args) {
        AnimalExtended cat = new AnimalExtended();
        System.out.println(cat.getName());
        System.out.println(cat.getAge());


        AnimalExtended dog = new AnimalExtended("Dog", 7);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());

    }
}

