package CustomerOrder;

public class Soda implements Orders {

    private String type;
    private int price;
    private int size;

    public Soda(String type, int price, int size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Soda{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    @Override
    public double getTotalCost() {
        return getPrice() * getSize();
    }
}
