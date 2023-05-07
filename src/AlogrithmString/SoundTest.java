package AlogrithmString;

public class SoundTest {
    public static void main(String[] args) {

        Animal animal=new Animal("bobs",40);
        Dogs dogs=new Dogs("rufus",13);
        System.out.println(dogs);
        System.out.println(dogs.speaks());
        System.out.println(animal);
        System.out.println(animal.speaks());
        System.out.println("string builder coming through");
        System.out.println();
        String dog="the animal speaks";
        String animals="woofs";
        String total=dog + "," +animals;
        StringBuilder str=new StringBuilder(total);
        System.out.println(str);



    }
}
