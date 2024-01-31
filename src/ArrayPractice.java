import java.util.Arrays;
import java.util.List;

public class ArrayPractice {
    public static void main(String[] args) {
        System.out.println(palindrome(("racecar")));
        System.out.println(palindrome("madams"));
        int[] sum = {5, 6, 8, 9, 2, 4, 3, 5,};
        int total = 0;
        int max = sum[0];
        Arrays.sort(sum);


        for (int element : sum){
            System.out.println(element);
        }
        for (int i = 0; i <sum.length ; i++) {
            total+=sum[i];
            System.out.println(total);

            if(sum[i]>max){
                max=sum[i];
            }

        }
        System.out.println("maximum is equal to" +" "+max);


        for (int element: sum){
            System.out.print(element+" ");
        }

        int n=sum.length +1;
        int miss =n * (n+1)/2;
        for (int element:sum){
            miss=miss-element;
        }
        System.out.println(miss);







    }
    public static boolean palindrome(String sb){
     StringBuilder sb1=new StringBuilder(sb);
     StringBuilder variable=sb1.reverse();
        if(sb.equalsIgnoreCase(String.valueOf(variable))){
          return true;

        }
        return false;
    }
}
