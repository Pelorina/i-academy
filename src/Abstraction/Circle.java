package Abstraction;



public class Circle implements Shape{

    private double pi=3.142;
    public double radius;

    public Circle(double pi, double radius) {
        this.pi = pi;
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + getPi() +
                ", radius=" + getRadius() +
                ", area =" + getarea() +
                '}';
    }

    @Override
    public double getarea() {
        return pi * Math.pow(radius,2);
    }
}
