package Maths;

public class SimpleCalculator implements Calculator {

    private int numbers;
    private int numerals;

    public SimpleCalculator(int numbers, int numerals) {
        this.numbers = numbers;
        this.numerals = numerals;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public int getNumerals() {
        return numerals;
    }

    public void setNumerals(int numerals) {
        this.numerals = numerals;
    }

    @Override
    public String toString() {
        return "SimpleCalculator{" +
                "numbers=" + numbers +
                ", numerals=" + numerals +
                '}';
    }

    @Override
    public double add() {
        return  getNumbers() + getNumerals();
    }

    @Override
    public double subtract() {
        return getNumbers() - getNumerals();
    }
}