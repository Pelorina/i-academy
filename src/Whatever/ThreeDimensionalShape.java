package Whatever;

public class ThreeDimensionalShape extends Shape {

    private double pi=3.142;
    private  double radius;

    public ThreeDimensionalShape(String circle, String rectangle, double pi, double radius) {
        super(circle, rectangle);
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
    public double getarea() {
        return ((4 * getPi()) * Math.pow(radius,2));
    }
    public double getvolume() {
        return ((4/3 *getPi()) * Math.pow(radius,3));
    }

    @Override
    public String toString() {
        return "ThreeDimensionalShape{" +
                "pi=" + pi +
                ", radius=" + radius +
                ", rectangle='" + rectangle + '\'' +
                '}';
    }
}
