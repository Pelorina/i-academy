package Whatever;

public class TwoDimensionalShape  extends Shape{
    private int length;
    private int width;

    public TwoDimensionalShape(String circle, String rectangle, int length, int width) {
        super(circle, rectangle);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return getLength() * getWidth();
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getarea() {
        return 0;
    }

    @Override
    public String toString() {
        return "TwoDimensionalShape{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
