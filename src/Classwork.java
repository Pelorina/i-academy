public class Classwork {

    private double radius;

    public Classwork(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void area(double radius, double pi) {

        try {
            if (radius == 0) {
                throw new IllegalArgumentException("cannot be zero");
            }
            double arae = pi * Math.pow(radius, 2);
            System.out.println(arae);

        } catch (IllegalArgumentException e) {
            System.out.println("radius " + e.getMessage());
        }
    }
    public  static void perimeter(double radius,double pi){
        try {
            if (radius == 0) {
                throw new IllegalArgumentException("cannot be zero");
            }
            double perimeter =2 * (pi * Math.pow(radius, 2));
            System.out.println(perimeter);

        } catch (IllegalArgumentException e) {
            System.out.println("radius " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        area(0, 3.142);
        perimeter(23,3.142);

    }
}

