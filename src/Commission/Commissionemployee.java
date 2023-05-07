package Commission;

public class Commissionemployee {
    private  String firstname;
    private  String lastname;
    private  int bvn;
    private  double grosssale;
    private double commissionrate;

    public  Commissionemployee(){
    }

    public Commissionemployee(String firstname, String lastname, int bvn, double grosssale, double commissionrate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bvn =setBvn(bvn) ;
        this.grosssale = setGrosssale(grosssale);
        this.commissionrate = commissionrate;
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

    public int getBvn() {
        return bvn;
    }

    public int setBvn(int bvn) {
        if (bvn <  10 || bvn > 10 ){
            throw new IllegalArgumentException("bvn does not exist");
        }
        this.bvn =setBvn(bvn);
        return bvn;
    }

    public double getGrosssale() {
        return grosssale;
    }

    public double setGrosssale(double grosssale) {
        if (grosssale ==0 || grosssale >10){
            throw new IllegalArgumentException("grosssale is null");
        }
        this.grosssale = setGrosssale(grosssale);
        return grosssale;
    }

    public double getCommissionrate() {
        return commissionrate;
    }

    public void setCommissionrate(double commissionrate) {
        this.commissionrate = commissionrate;
    }
}
