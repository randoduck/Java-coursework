import java.util.Scanner;

class EMPLOYEE {
    String name;
    int id;
    double salary;

    // Default Constructor
    EMPLOYEE() {
        name = "Unknown"; 
        id = 0;
        salary = 0.0;
    }

    // Parameterized Constructor
    EMPLOYEE(String name, int id, double salary) {   
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {   
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class employeetext {
    int Eid;
    String epname;
    double basic, DA, IT, Gross_Sal, Net_Sale;

    // Default Constructor
    employeetext() {
        Eid = 0;
        epname = "Unknown";
        basic = 0.0;
    }

    // Parameterized Constructor
    employeetext(int Eid, String epname, double basic) {
        this.Eid = Eid;
        this.epname = epname;
        this.basic = basic;
        compute_basic_net(); // Compute salary details automatically
    }

    public void read(Scanner sc) {
        System.out.println("Enter Employee ID: ");
        Eid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name: ");
        epname = sc.nextLine();
        System.out.println("Enter Basic Salary: ");
        basic = sc.nextDouble();
        compute_basic_net(); // Compute salary after taking input
    }

    public void compute_basic_net() {
        DA = 0.52 * basic;
        Gross_Sal = basic + DA;
        IT = 0.3 * Gross_Sal;
        Net_Sale = Gross_Sal - IT;
    }

    public void display() {
        System.out.println("-----------EMPLOYEE DETAILS-----------");
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Name: " + epname);
        System.out.println("Basic Salary: " + basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sale);
        System.out.println();
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demonstrating Default Constructor
        EMPLOYEE e1 = new EMPLOYEE();
        System.out.println("Default Constructor:");
        e1.display();

        // Demonstrating Parameterized Constructor
        EMPLOYEE e2 = new EMPLOYEE("Isha Sarvani", 78832, 10000.0);
        System.out.println("\nParameterized Constructor:");
        e2.display();

        System.out.println("\nEnter number of employees: ");
        int n = sc.nextInt();
        employeetext[] emp = new employeetext[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ": ");
            emp[i] = new employeetext();  // Using default constructor
            emp[i].read(sc);
        }

        System.out.println("\nEmployee Details: ");
        for (employeetext r : emp) {
            r.display();
        }

        sc.close();
    }
}
