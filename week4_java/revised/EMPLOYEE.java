class EMPLOYEE {
    String name;
    int id;
    double salary;

    EMPLOYEE() {
        name = "Unknown";
        id = 0;
        salary = 0.0;}

    EMPLOYEE(String name, int id, double salary) 
    {   this.name = name;
        this.id = id;
        this.salary = salary;}


    void display() 
    {   System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);}

    public static void main(String[] args) {
        EMPLOYEE e1 = new EMPLOYEE(); 
        System.out.println("Default Constructor:");
        e1.display();

        EMPLOYEE e2 = new EMPLOYEE("Isha Sarvani", 78832, 10000.0); 
        System.out.println("Parameterized");
        e2.display();}}
