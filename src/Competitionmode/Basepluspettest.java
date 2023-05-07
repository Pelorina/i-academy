package Competitionmode;

import Commission.Basepluscommision;

public class Basepluspettest {
    public static void main(String[] args) {
        Comissiompetmode1 comissiompetmode1 = new Comissiompetmode1("sarah", "adelola", "12345678789", 2000.00, 7.00);
        comissiompetmode1.income();
        System.out.println("name:" + " " + comissiompetmode1.getFirstname() + " " + comissiompetmode1.getLastname());
        System.out.println("your bvn is" + " " + comissiompetmode1.getnumber());
        comissiompetmode1.setCommissionrate(11.00);

        System.out.println();
        System.out.println("new object");

//        Basepluscommision basepluscommision=new Basepluscommision("kehinde", "raji",123456789,8000.00,9.00,5000.00);
//        basepluscommision.earning();
//        System.out.println(basepluscommision.getBasesalary());
//        System.out.println(basepluscommision.getCommissionrate());

        Basepluspetmode1 basepluspetmode1=new Basepluspetmode1("joyce","gabriel","12345678934",6000.00,6.00,5000.00);
        basepluspetmode1.getBasesalary();
        System.out.println(basepluspetmode1.getFirstname() + " " + basepluspetmode1.getLastname());


    }
}