package AbstractionAndComposition;

public class Car  {

    private  String name;
    private  int model;

    private Engine properties;

    private Wheel propertiees;

    public Car(String name, int model, Engine properties, Wheel propertiees) {
        this.name = name;
        this.model = model;
        this.properties = properties;
        this.propertiees = propertiees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }


    public Wheel getPropertiees() {
        return propertiees;
    }

    public void setPropertiees(Wheel propertiees) {
        this.propertiees = propertiees;
    }


    public Engine getProperties() {
        return properties;
    }

    public void setProperties(Engine properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", properties=" + properties +
                ", propertiees=" + propertiees +
                '}';
    }

}
