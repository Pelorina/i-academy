package Competitionmode;

public class Basepluspetmode1 extends Comissiompetmode1 {
    private  double basesalary;


    public Basepluspetmode1(String firstname, String lastname, String number, double grossale, double commissionrate, double basesalary) {
        super(firstname, lastname, number, grossale, commissionrate);
        this.basesalary = basesalary;
    }

    public double getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(double basesalary) {
        this.basesalary = basesalary;
    }

    public  void Ego (){
        double salary;
        salary = (getBasesalary() + getGrossale()) * getCommissionrate();
    }
}
