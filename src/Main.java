import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    }

    public static class Summation {

        public static void main(String[] args) {
            ArrayList<Integer> numbers=new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
            numbers.add(7);
            numbers.add(8);
            numbers.add(9);
            numbers.add(10);
            System.out.println(numbers);
            ArrayList<Integer>NUMBER=new ArrayList<>(List.of(1,23,4,5,2));
            System.out.println(NUMBER);
            ArrayList<ArrayList<Integer>> total=new ArrayList<>();
            total.add(numbers);
            total.add(NUMBER);
            System.out.println(total);


            ArrayList<String>items=new ArrayList<>(List.of("apple","orange","pineapple","honey"));
            System.out.println(items);
            items.sort(Comparator.naturalOrder());
            items.removeAll(items);
            System.out.println(items);

        }
    }
}