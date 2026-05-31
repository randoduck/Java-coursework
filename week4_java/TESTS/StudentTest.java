class STUDENT {
    // Class members
    String sname = "Isha";  // Student name
    int[] marks_array;  // Array to store marks of the student
    int total;  // Variable to store total marks
    float avg;  // Variable to store average marks
    int age, rollno;  // Additional fields for age and roll number

    // Default constructor
    public STUDENT() {
        this.age = 0;
        this.rollno = 0;
        this.marks_array = new int[0];  // Initialize marks_array as empty
        display();  // Display default values
    }

    // Constructor with parameters
    public STUDENT(String sname, int age, int rollno, int[] marks) {
        this.sname = sname;
        this.age = age;
        this.rollno = rollno;
        this.marks_array = marks;
        compute();  // Compute total and average
        display();  // Display the details after computing
    }

    // Method to compute total and average marks
    public void compute() {
        total = 0;  // Initialize total to 0
        for (int i = 0; i < marks_array.length; i++) {
            total += marks_array[i];  // Add each mark to the total
        }
        avg = total / (float) marks_array.length;  // Compute the average
    }

    // Method to display the student details
    public void display() {
        System.out.println("Student Name: " + sname);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollno);
        System.out.print("Marks: ");
        for (int i = 0; i < marks_array.length; i++) {
            System.out.print(marks_array[i] + " ");  // Display each mark
        }
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        // Create objects of the STUDENT class
        int marks1[] = {85, 90, 78, 88, 92};  // Marks array for the first student
        int marks2[] = {75, 80, 85, 95, 88};  // Marks array for the second student

        // Create student objects with specified data
        STUDENT student1 = new STUDENT("John Doe", 18, 123, marks1);
        STUDENT student2 = new STUDENT("Isha", 18, 78, marks2);

        // Alternatively, if you want to use default constructor and set values later:
        STUDENT student3 = new STUDENT();  // Default student
        student3.age = 20;         // Assigning age
        student3.rollno = 101;     // Assigning roll number
        student3.marks_array = new int[]{80, 85, 88, 90};  // Assigning marks
        student3.compute();  // Compute total and average
        student3.display();  // Display the details
    }
}
