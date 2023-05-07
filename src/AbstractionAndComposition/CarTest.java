package AbstractionAndComposition;

public class CarTest {
    public static void main(String[] args) {


        Engine properties = new Engine("carmy", 1, "two years", 1.5000000);
        Wheel propertiees = new Wheel("toyota", 4, "three years", 2.5000000);
        Car car = new Car("oppo", 2016, properties, propertiees);

        System.out.println(car);
        System.out.println( "the total cost of the engine is"+ ":" +propertiees.getTotalcost());
        System.out.println(  "the total cost of the wheel is"+ ":" +properties.getTotalCost());
    }
}