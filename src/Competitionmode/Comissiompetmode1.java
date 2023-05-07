package Competitionmode;

public class Comissiompetmode1 {
    private  String firstname;
    private   String lastname;
    private   String number;
    private  double grossale;
    private  double commissionrate;

    public  Comissiompetmode1 (){
    }

    public Comissiompetmode1(String firstname, String lastname, String number, double grossale, double commissionrate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
        this.grossale = grossale;
        this.commissionrate = setCommissionrate(commissionrate);
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

    public String getnumber() {
        return number;
    }

    public void setBvn(String number) {
        this.number = number;
    }

    public double getGrossale() {
        return grossale;
    }

    public void setGrossale(double grossale) {
        this.grossale = grossale;
    }

    public double getCommissionrate() {
        return commissionrate;
    }

    public double setCommissionrate(double commissionrate) {
        try {
            if (commissionrate <1 || commissionrate >10){
                throw  new IllegalArgumentException("commission rate should be between 1 and 10");
            }
        }catch (IllegalArgumentException Y){
            System.out.println(Y.getMessage());
        }
        this.commissionrate = commissionrate;
        return commissionrate;
    }

    public void  income() {
        double  income;
        income = getGrossale() * getCommissionrate();
    }
}
