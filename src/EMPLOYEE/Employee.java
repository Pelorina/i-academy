package EMPLOYEE;

public class Employee {
    private  String firstname;
    private  String lastname;
    private  String bvn;
    public Employee(){
    }

    public Employee(String firstname, String lastname, String bvn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bvn = bvn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBvn() {
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", bvn='" + bvn + '\'' +
                '}';
    }
}
