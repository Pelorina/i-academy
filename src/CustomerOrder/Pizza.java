package CustomerOrder;

public  class Pizza implements Orders{

    private String type;
    private  int price;
    private  int size;

    public Pizza(String type, int price, int size) {
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

    @Override
    public String toString() {
        return "Pizza{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    @Override
    public double getTotalCost() {
        return getPrice() * getSize();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
