package AbstractionAndComposition;

public class Engine implements Methods {
    private String type;
    private int number;
    private String guarantee;
    private  double totalCost;

    public Engine(String type, int number, String guarantee,double totalCost) {
        this.type = type;
        this.number = number;
        this.guarantee = guarantee;
        this.totalCost=totalCost;
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

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", number=" + number +
                ", guarantee='" + guarantee + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }

    @Override
    public double totalCost() {
        return getTotalCost();
    }
}
