package Composition;

public class CourseClass {

    private  String courseTitle;
    private  CourseWorkMark courseMark;

    public CourseClass(String courseTitle, CourseWorkMark courseMark) {
        this.courseTitle = courseTitle;
        this.courseMark = courseMark;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public CourseWorkMark getCourseMark() {
        return courseMark;
    }

    public void setCourseMark(CourseWorkMark courseMark) {
        this.courseMark = courseMark;
    }

    @Override
    public String toString() {
        return "CourseClass{" +
                "courseTitle='" + courseTitle + '\'' +
                ", courseMark=" + courseMark +
                '}';
    }
}
