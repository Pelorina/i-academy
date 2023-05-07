package Inheritance;

public class Car extends Vehicle {
    private  int  numofdoors;
    private String fueltype;

    public Car(String make, String model, int year, String colour,int numofdoors,String fueltype ) {
        super(make,model,year,colour);
        this.numofdoors=numofdoors;
        this.fueltype=fueltype;

    }

    public int getNumofdoors() {
        return numofdoors;
    }

    public void setNumofdoors(int numofdoors) {
        this.numofdoors = numofdoors;
    }

    public String getFueltype() {
        return fueltype;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numofdoors=" + numofdoors +
                ", fueltype='" + fueltype + '\'' +
                '}';
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }
}
