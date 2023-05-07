package Inheritances;

public class Animal extends Creature {

    private  String habitat;
    private  String diets;


    public Animal(String name, int age, Gender gender, String habitat, String diets) {
        super(name, age, gender);
        this.habitat = habitat;
        this.diets = diets;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDiets() {
        return diets;
    }

    public void setDiets(String diets) {
        this.diets = diets;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "habitat='" + habitat + '\'' +
                ", diets='" + diets + '\'' +
                '}';
    }
}
