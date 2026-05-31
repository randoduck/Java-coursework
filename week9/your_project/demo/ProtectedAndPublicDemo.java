package demo;

import department.Course;
import subject.Subject;

public class ProtectedAndPublicDemo {
    public static void main(String[] args) {
      
      
      
        Course course = new Course();
        course.setDepartmentDetails("Computer Science", "CS01");
        course.setCourseDetails("Data Science", 24);
        course.displayCourseWithDepartmentDetails();

        // ❌ Try to directly access protected member from outside package
        // System.out.println(course.departmentName); // ❌ ERROR: not accessible

        // ✅ Access public member
        System.out.println("Accessing public department code: " + course.departmentCode);

        // Subject object
        Subject subject = new Subject();
        subject.setSubjectDetails("Java Programming", 4);
        subject.displaySubjectDetails();

        // ❌ Try to access private variables directly
        // System.out.println(subject.subjectName);     // ❌ ERROR: not accessible
        // System.out.println(subject.subjectCredits);  // ❌ ERROR: not accessible
    }
}
