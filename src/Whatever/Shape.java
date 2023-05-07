package Whatever;

public abstract class Shape {
    private String circle;
    public  String rectangle;

    public Shape(String circle, String rectangle) {
        this.circle = circle;
        this.rectangle = rectangle;
    }

    public String getCircle() {
        return circle;
    }

    public String getRectangle() {
        return rectangle;
    }
    public abstract double getarea();

    @Override
    public String toString() {
        return "Shape{" +
                "circle='" + circle + '\'' +
                ", rectangle='" + rectangle + '\'' +
                '}';
    }
}
