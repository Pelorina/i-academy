package BinarySearch;

import lombok.Getter;
import lombok.Setter;


public class Object {
    private String[] name={"finn"};
     private int[] age={20};
    private double[] salary={1500.00};

     public Object(String[] name, int[] age, double[] salary) {
          this.name = name;
          this.age = age;
          this.salary = salary;
     }

     public String[] getName() {
          return name;
     }

     public void setName(String[] name) {
          this.name = name;
     }

     public int[] getAge() {
          return age;
     }

     public void setAge(int[] age) {
          this.age = age;
     }

     public double[] getSalary() {
          return salary;
     }

     public void setSalary(double[] salary) {
          this.salary = salary;
     }
}
