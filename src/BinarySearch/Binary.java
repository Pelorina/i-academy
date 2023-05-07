package BinarySearch;

import java.util.Arrays;
import java.util.Objects;

public class Binary {
    public static void main(String[] args) {
        Object object=new Object(new String[]{"finn"}, new int[]{20}, new double[]{1500.00});
        Object1 object1=new Object1(new String[]{"sadie"}, new int[]{21}, new double[]{1500.00});
        if (Arrays.equals(object.getAge(), object1.getAge()) || Arrays.equals(object.getSalary(), object1.getSalary())) {
            System.out.println("is equal");
        }else {
            System.out.println("not equal");
        }
        System.out.println("binary search coming through");
        String[] john = {"anna", "rhodes", "sadie", "bobs", "cara"};
        System.out.println(Arrays.toString(john));
        Arrays.sort(john);
        System.out.println(Arrays.toString(john));

        if (Arrays.binarySearch(john,"sadie")>0){
            System.out.println("match is found");
        }else {
            System.out.println("match not found");
        }

        System.out.println("equal coming through");
        int[] sb={1,2,3,4,5,6,7,8,9,10};
        int[] sb1={1,2,3,4,5,6,7,8,9,10,1};

        if (Arrays.equals(sb,sb1)){
            System.out.println("is equal");
        }else {
            System.out.println("not equal");
        }

        }
    }
