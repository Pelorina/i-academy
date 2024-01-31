package Iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractices {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("pelorina");
        List<String> list=new ArrayList<>();
        list.add("rooney");
        list.add("okocha");
        list.add("rooney");
        set.addAll(list);

        for (String s:set){
            System.out.println(s);
        }
    }
}