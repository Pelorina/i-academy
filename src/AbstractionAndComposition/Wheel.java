package AbstractionAndComposition;

public class Wheel implements Methods {

    private String type;
    private int number;
    private String guarantee;
    private  double totalcost;

    public Wheel(String type, int number, String guarantee, double totalcost) {
        this.type = type;
        this.number = number;
        this.guarantee = guarantee;
        this.totalcost = totalcost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public double getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(double totalcost) {
        this.totalcost = totalcost;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "type='" + type + '\'' +
                ", number=" + number +
                ", guarantee='" + guarantee + '\'' +
                ", totalcost=" + totalcost +
                '}';
    }


    @Override
    public double totalCost() {
        return getTotalcost();
    }
}
