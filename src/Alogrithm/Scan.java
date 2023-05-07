package Alogrithm;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentences :");
        String sentence= scanner.next();
        System.out.println("string builder coming through");
        StringBuilder str= new StringBuilder(sentence);
        System.out.println(str.reverse());

    }
}