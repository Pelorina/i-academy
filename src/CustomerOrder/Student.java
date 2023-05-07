package CustomerOrder;

public class Student implements School {

    private int examsScore;
    private String subject;
    private  int testScore;
    private int numberPresent;

    public Student(int examsScore, String subject, int testScore, int numberPresent) {
        this.examsScore = examsScore;
        this.subject = subject;
        this.testScore = testScore;
        this.numberPresent=numberPresent;

    }

    public int getExamsScore() {
        return examsScore;
    }

    public void setExamsScore(int examsScore) {
        this.examsScore = examsScore;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

    public int getNumberPresent() {
        return numberPresent;
    }

    public void setNumberPresent(int numberPresent) {
        this.numberPresent = numberPresent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "examsScore=" + examsScore +
                ", subject='" + subject + '\'' +
                ", testScore=" + testScore +
                ", numberPresent" + numberPresent +
                '}';
    }

    @Override
    public double getGpa() {
        return ((double) (getExamsScore() * getExamsScore()) /100)   ;
    }

    @Override
    public double getAttendances() {
        return getNumberPresent() ;
    }
}
