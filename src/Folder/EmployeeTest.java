package Folder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("pelumi", "pelorina", 7500000.0, "IT"),
                new Employee("emperor", "ade", 9000.0, "marketing")
        };
        List<Employee> employeeList = Arrays.asList(employees);
        employeeList.stream().forEach(System.out::println);
        System.out.println("sorted based on salary");
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        System.out.println("filter employee based on a particular salary range ");
        Predicate<Employee> salaryRange=employee -> employee.getSalary() >=4000 && employee.getSalary() <= 60000;
        employeeList.stream().filter(salaryRange).forEach(System.out::println);
    }
}