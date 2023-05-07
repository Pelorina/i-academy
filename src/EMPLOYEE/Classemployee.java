package EMPLOYEE;

public class Classemployee {
    private String firstname;
    private String lastname;
    private String bvn;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getBvn() {
        return bvn;
    }

    @Override
    public String toString() {
        return "Classemployee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", bvn='" + bvn + '\'' +
                '}';
    }
}
