package Composition;

public class Main {
    public static void main(String[] args) {
        CourseWorkMark java =new CourseWorkMark(10,35,60);
        CourseClass javaCourse = new CourseClass("Java", java);

        System.out.println(javaCourse);
    }
}
