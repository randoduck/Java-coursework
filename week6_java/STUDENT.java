import java.util.Scanner;

public class STUDENT {
    String sname, name;
    int rollno, total;
    double average;
    Subject[] subjects; // Array of Subject objects

    // Inner Class for Subject
    class Subject {
        String subname;
        int marks;

        Subject(String subname, int marks) {
            this.subname = subname;
            this.marks = marks;
        }

        void display() {
            System.out.println("Subject: " + subname + ", Marks: " + marks);
        }
    }

    // Method to Assign Subjects and Marks
    void assign(Scanner sc) {
        System.out.println("Enter Student name: ");
        sname = sc.next();
        System.out.println("Enter number of subjects: ");
        int n = sc.nextInt();
        subjects = new Subject[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Subject " + (i + 1) + " Name and Marks: ");
            subjects[i] = new Subject(sc.next(), sc.nextInt());
        }
    }

    // Compute Total and Average
    void compute() {
        total = 0;
        for (Subject s : subjects) total += s.marks;
        average = (double) total / subjects.length;
    }

    // Display Student Details & Subjects
    void display() {
        System.out.println("Student Name: " + sname);
        System.out.println("---------- Score Card ---------");
        for (Subject s : subjects) s.display();
        System.out.println("Total: " + total + ", Average: " + average);
    }

    // Extract Initials from Name
    String extractInitials() {
        if (sname == null) return "";
        String[] words = sname.split("\\s+");
        String initials = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                initials += word.charAt(0);
            }
        }
        return initials.toUpperCase();
    }

    // Remove Whitespace from Name
    String removeWhitespace() {
        return (sname != null) ? sname.replaceAll("\\s", "") : "";
    }

    // List all student names containing a particular substring
    static void listStudentsContaining(STUDENT[] students, String substring) {
        System.out.println("Students containing \"" + substring + "\":");
        for (STUDENT student : students) {
            if (student.sname != null && student.sname.contains(substring)) {
                System.out.println(student.sname);
            }
        }
    }

    // Default Constructor
    STUDENT() {
        name = "Unknown";
        rollno = 0;
        sname = "Unknown";
    }

    // Parameterized Constructor
    STUDENT(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
        this.sname = name;
    }

    // Display Student Basic Details
    void displayBasic() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollno);
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        STUDENT s1 = new STUDENT();
        STUDENT s2 = new STUDENT("Isha", 78);

        System.out.println("------ Enter Student Details ------");
        s1.assign(sc);
        s1.compute();
        s1.display();

        // Testing new methods
        System.out.println("Extracted Initials: " + s1.extractInitials());
        System.out.println("Name without Whitespace: " + s1.removeWhitespace());

        System.out.println("\n------ Default Constructor Output ------");
        s1.displayBasic();

        System.out.println("\n------ Parameterized Constructor Output ------");
        s2.displayBasic();

        // Test listing students by substring
        STUDENT[] students = {s1, s2};
        System.out.println("\nEnter substring to search: ");
        String substring = sc.next();
        listStudentsContaining(students, substring);
        
        sc.close();
    }
}
