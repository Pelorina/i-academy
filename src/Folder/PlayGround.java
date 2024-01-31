package Folder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PlayGround {

    public static void main(String[] args) {
    List<Integer> list= Arrays.asList(18,9,25,7,80,90,5,11,10);
        System.out.println(filterList(list,10));

        Predicate<Integer> greaterThan10=(element)->element>10;
        Predicate<Integer> greaterThan20=(i)->i >20;
        System.out.println(list.stream().filter(greaterThan10).collect(Collectors.toList()));
        System.out.println(list.stream().filter(greaterThan20).collect(Collectors.toList()));



        String[] colors={"RED","orange","yellow","green","blue","indigo","violet"};
     List<String> firstResult = Arrays.stream(colors).map(element ->element.toLowerCase()).toList();
        List<String> secondResult= Arrays.stream(colors).map(String::toLowerCase).toList();
        System.out.println(firstResult);
        System.out.println(secondResult);

    }


    public static List<Integer> filterList(List<Integer> list,int n){
        List<Integer> result=new ArrayList<>();
        for (Integer integer:list){
            if(integer >n){
                result.add(integer);
            }

        }
return  result;
    }
}
