package Polymorphism;

public class AnimalTest {

    public static void main(String[] args) {

        Animal animal=new Animal("cow",20);
        Cat cat=new Cat("kitty",1);
        System.out.println(animal);
        System.out.println(animal.speak());
        System.out.println(cat);
        System.out.println(cat.speak());
    }
}
