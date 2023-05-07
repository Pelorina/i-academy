package Package;

public class Person {
    private  String name;
    private int age;
    private String address;

    public  Person () {

    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = setAge(age);
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age <0 || age>150){
            throw new IllegalArgumentException("age is invalid");
        }
        this.age = age;
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void validateage(){
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
