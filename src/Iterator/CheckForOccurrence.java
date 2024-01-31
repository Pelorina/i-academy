package Iterator;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckForOccurrence {


        public static void main(String[] args) {
            String input = "banana";

            Map<Character, Integer> occurrenceMap = countCharacterOccurrences(input);

            for (Map.Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
            System.out.println(countCharacterOccurrences("pelumi"));
            System.out.println(palindrome("raceCar"));
        }

        public static Map<Character, Integer> countCharacterOccurrences(String input) {
            Map<Character, Integer> occurrenceMap = new HashMap<>();

            for (char c : input.toCharArray()) {
                occurrenceMap.put(c, occurrenceMap.getOrDefault(c, 0) + 1);
            }

            return occurrenceMap;
        }
        public static boolean palindrome(String input){

            StringBuilder sb=new StringBuilder(input);
            StringBuilder variable=sb.reverse();
            return input.equalsIgnoreCase(variable.toString());
        }
    }


