package Package;

public class Addperson extends Person{
    private  int score;

    public Addperson(int score) {
        this.score = score;
    }

    public Addperson(String name, int age, String address, int score) {
        super(name, age, address);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Addperson{" +
                "score=" + score +
                '}';
    }
}
