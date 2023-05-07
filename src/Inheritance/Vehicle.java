package Inheritance;

public class Vehicle {
    private String make;
    private String MODEL;
    private int year;
    private String colour;
    public Vehicle (){

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", MODEL='" + MODEL + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }

    public Vehicle(String make, String MODEL, int year, String colour) {
        this.make = make;
        this.MODEL = MODEL;
        this.year = year;
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMODEL() {
        return MODEL;
    }

    public void setMODEL(String MODEL) {
        this.MODEL = MODEL;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

