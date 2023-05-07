package CustomerOrder;

public class StudentTest {

    public static void main(String[] args) {
        Persons persons=new Persons("adeoti ayanfe",45,"33 jimoh ojora street");
        Student student =new Student(70,"chemistry",38,100);

        System.out.println(persons);
        System.out.println(persons.getAttendances());
        System.out.println("score coming through");
        System.out.println(student);
        System.out.println(student.getAttendances());
        System.out.println(student.getGpa());
    }
}
