package Composition;

public class CourseWorkMark {
    private  int quiz;
    private  int test;
    private int projects;

    public CourseWorkMark(int quiz, int test, int projects) {
        this.quiz = quiz;
        this.test = test;
        this.projects = projects;
    }

    public int getQuiz() {
        return quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public int getProjects() {
        return projects;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "CourseWorkMark{" +
                "quiz=" + quiz +
                ", test=" + test +
                ", projects=" + projects +
                '}';
    }
}
