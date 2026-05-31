import java.util.Scanner;3

s
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
        this.name = formatEmployeeName(name);
        this.id = id;
        this.salary = salary;
    }

    void display() {   
        System.out.println("-----------EMPLOYEE BASIC DETAILS-----------");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Email: " + generateEmail());
    }

    // Method to format employee name
    String formatEmployeeName(String name) {
        String[] words = name.toLowerCase().split("\\s+");
        StringBuilder formattedName = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                formattedName.append(Character.toUpperCase(word.charAt(0)))
                             .append(word.substring(1))
                             .append(" ");
            }
        }
        return formattedName.toString().trim();
    }

    // Method to generate email from name
    String generateEmail() {
        String[] words = name.toLowerCase().split("\\s+");
        String email = words[0].charAt(0) + words[words.length - 1] + "@gmail.com";
        return email;
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

    public void compute_basic_net() {
        DA = 0.52 * basic;
        Gross_Sal = basic + DA;
        IT = 0.3 * Gross_Sal;
        Net_Sale = Gross_Sal - IT;
    }

    public void display() {
        System.out.println("-----------EMPLOYEE SALARY DETAILS-----------");
        System.out.println("Employee ID: " + Eid);
        System.out.println("Employee Name: " + epname);
        System.out.println("Basic Salary: " + basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Income Tax: " + IT);
        System.out.println("Net Salary: " + Net_Sale);
        System.out.println();
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        EMPLOYEE[] employees = new EMPLOYEE[n];
        employeetext[] employeeSalaries = new employeetext[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ": ");
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Basic Salary: ");
            double basic = sc.nextDouble();
            sc.nextLine();

            employees[i] = new EMPLOYEE(name, id, basic);
            employeeSalaries[i] = new employeetext(id, name, basic);
        }

        System.out.println("\nEmployee Details: ");
        for (int i = 0; i < n; i++) {
            employees[i].display();
            employeeSalaries[i].display();
        }

        sc.close();
    }
}
