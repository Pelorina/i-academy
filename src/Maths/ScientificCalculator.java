package Maths;

public class ScientificCalculator implements  Calculator {

    private double squareRoot;
    private  double cos;

    public ScientificCalculator(double squareRoot, double cos) {
        this.squareRoot = squareRoot;
        this.cos = cos;
    }

    public double getSquareRoot() {
        return squareRoot;
    }

    public void setSquareRoot(double squareRoot) {
        this.squareRoot = squareRoot;
    }

    public double getCos() {
        return cos;
    }

    public void setCos(double cos) {
        this.cos = cos;
    }

    @Override
    public String toString() {
        return "ScientificCalculator{" +
                "squareRoot=" + squareRoot +
                ", cos=" + cos +
                '}';
    }

    @Override
    public double add() {
        return getCos() * Math.pow(getSquareRoot(),2);
    }

    @Override
    public double subtract() {
        return Math.hypot(getCos(),getSquareRoot());
    }
}
