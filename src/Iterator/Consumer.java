package Iterator;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Consumer {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "added", "sarah", "logo", "open sources"
        ));
        for (String element : list) {
            System.out.println(element);
        }
        list.forEach(System.out::println);


        LinkedList<Integer> list1 = new LinkedList<>();
        list1.offer(10);
        list1.add(12);
        list1.offerFirst(24);
        list1.offerLast(40);
        list1.add(23);
        int max = 0;
        list1.forEach((element) -> System.out.println(element));

        System.out.println("maximum coming through");
        for (int i = 0; i < list1.size(); i++) {
//            System.out.println(list1.get(i));
            if (max < list1.get(i)) {
                max = list1.get(i);
            }

        }
        System.out.println(max);
        System.out.println(list1.size());


        LinkedList<Integer> list2 = new LinkedList<>();
        list2.offer(12);
        list2.offerLast(45);
        list2.offerFirst(34);
        list2.add(0);
        list2.add(90);
        System.out.println(list2);

        list2.addAll(list1);
        System.out.println(list2);
        Integer average = 0;
        Integer smallest = 0;
        Integer given = 12;

        Iterator<Integer> iterator = list1.listIterator();

        while (iterator.hasNext()) {
             iterator.next();
            if (iterator.next().compareTo(average)<0) {
                 average=iterator.next();
            }
        }
        System.out.println(average);


    }
}