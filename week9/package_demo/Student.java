// package_demo/Student.java
package package_demo;

public class Student {
    private String name;
    private int rollNumber;

    // Public setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Public method to show student details
    public void studentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}
