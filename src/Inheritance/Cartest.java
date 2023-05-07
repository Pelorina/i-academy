package Inheritance;

public class Cartest {
    public static void main(String[] args) {
        Car car=new Car("oyelola", "toyota",2007,"white", 4,"petrol");
        String carmake;
        String carmodel;
        carmake=car.getMake();
        System.out.println(carmake);

        carmodel=car.getMODEL();
        System.out.println(carmodel);
    }



}
