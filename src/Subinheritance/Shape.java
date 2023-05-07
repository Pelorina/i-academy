package Subinheritance;

public class Shape {
    public static  double getarea( double radius){
        double area;
           return  area= 3.142 * Math.pow(radius,2);
    }

    public static void main(String[] args) {
        System.out.println(getarea(7));
    }
}
