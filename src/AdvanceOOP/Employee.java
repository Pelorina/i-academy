package AdvanceOOP;

public class Employee {
    private  String firstname;
    private String lastname;
    private String bvn;
    private Gender gender;
    private String birthdate;
    private String hiredate;
    private  String weddingdate;

    public Employee (String firstname, String lastname,String bvn, Enum gender, String birthdate, String hiredate, String weddingdate){
        this.firstname=firstname;
        this.lastname=lastname;
        this.bvn=bvn;
        this.birthdate=birthdate;
        this.hiredate=hiredate;
        this.weddingdate=weddingdate;
    }
public int displaydate (){
    return 0;
}
}
