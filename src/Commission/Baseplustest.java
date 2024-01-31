package Commission;

public class Baseplustest {
    public static void main(String[] args) {
        Basepluscommision basepluscommision=new Basepluscommision("sarah","adeoti",1234567892,5000.00,100.00,3000.00);
        basepluscommision.setGrosssale(8000);
        basepluscommision.getGrosssale();
        basepluscommision.earning();
    }
}
