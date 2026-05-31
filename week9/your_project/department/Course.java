package department;

public class Course extends Department {
    private String courseName;       // Private
    private int courseDuration;      // Private

    public void setCourseDetails(String name, int duration) {
        this.courseName = name;
        this.courseDuration = duration;
    }

    public void displayCourseWithDepartmentDetails() {
        displayDepartmentDetails();  // Inherited method
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Duration: " + courseDuration + " months");
    }
}
