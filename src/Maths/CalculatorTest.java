package Maths;

public class CalculatorTest {
    public static void main(String[] args) {

    ScientificCalculator scientificCalculator=new ScientificCalculator(40,0.8);
    SimpleCalculator simpleCalculator=new SimpleCalculator(67,45);

        System.out.println(scientificCalculator);
        System.out.println(simpleCalculator);
        System.out.println(scientificCalculator.add());
        System.out.println(scientificCalculator.subtract());
        System.out.println(simpleCalculator.add());
        System.out.println(simpleCalculator.subtract());
    }
}
