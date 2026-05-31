// package_demo/PrivateAccessDemo.java
// create a package_demo that has two java folders:
// 1.Student.java 2.PrivateAccessDemo.java
// and paste the codes there 

// to execute , navigate to the folder which has package_demo folder
// and run this command in cmd : javac package_demo/Student.java package_demo/PrivateAccessDemo.java
// after this is compiled, to run : java package_demo.PrivateAccessDemo

package package_demo;

public class PrivateAccessDemo {
    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setter methods
        student.setName("Isha Sarvani");
        student.setRollNumber(78);

        // Display student details
        student.studentDetails();

      
    }
}
