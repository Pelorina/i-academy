package CustomerOrder;

public class ItemTest {
    public static void main(String[] args) {


        Pizza pizza = new Pizza("solo", 4000, 5);
        Soda soda = new Soda("min", 500, 2);

        System.out.println(pizza);
        System.out.println(soda);
        System.out.println("the total cost of your pizza is" + pizza.getTotalCost());
        System.out.println("the total cost of your soda is " + soda.getTotalCost());
    }
}