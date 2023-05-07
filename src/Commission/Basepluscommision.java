package Commission;

public class Basepluscommision extends Commissionemployee{
    private double basesalary;


    public Basepluscommision(String firstname, String lastname, int bvn, double grosssale, double commissionrate, double basesalary) {
        super(firstname, lastname, bvn, grosssale, commissionrate);
        this.basesalary = basesalary;

    }

    public double getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(double basesalary) {
        this.basesalary = basesalary;
    }

    public void earning(){
        double earning;
        earning=(getGrosssale() *getCommissionrate()) / getBasesalary();
    }
}
