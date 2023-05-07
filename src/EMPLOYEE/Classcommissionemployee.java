package EMPLOYEE;

import com.sun.source.tree.CatchTree;

public class Classcommissionemployee extends Employee  {
    private  double grossale;
    private  double commissionrate;



    public Classcommissionemployee(String firstname, String lastname, String bvn, double grossale, double commissionrate) {
        super(firstname, lastname, bvn);
        this.grossale = setGrossale(grossale);
        this.commissionrate = commissionrate;
    }

    public double getGrossale() {
        return grossale;
    }

    public double setGrossale(double grossale) {
        try{
            if (grossale <0 || grossale >10000.00){
                throw new IllegalArgumentException("grossale is null");
            }
        }catch (IllegalArgumentException A){
            System.out.println(A.getMessage());
        }
        this.grossale = grossale;
        return  grossale;
    }

    public double getCommissionrate() {
        return commissionrate;
    }

    public void setCommissionrate(double commissionrate) {
        this.commissionrate = commissionrate;
    }
    public double earning(){
        double earning;
        earning= getGrossale() * getCommissionrate();
        return earning;
    }
}
