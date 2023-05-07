package Inheritances;

public class AnimalTest {

    public static void main(String[] args) {
        Creature creature=new Creature("cats",7,Gender.Male);
        Animal animal = new Animal("dog", 56, Gender.Female, "kennel", "dogs feeds");
        System.out.println(animal);
        System.out.println(creature);

    }
}