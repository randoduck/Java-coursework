class STUDENT2 {
    String name;
    String sub;
    int rollNo;

    // Default Constructor
    STUDENT2() 
    {   name = "Batman";
        sub = "none";
        rollNo = 0;}

   // Parameterized Constructor
    STUDENT2(String name, String sub, int rollNo) 
     {  this.name = name;
        this.sub = sub;
        this.rollNo = rollNo;}

    // Display Method
    void display() 
   {    System.out.println("Name: " + name);
        System.out.println("Subject: " + sub);
        System.out.println("Roll Number: " + rollNo);}

    // Main Method for Testing
    public static void main(String[] args) 
   {    STUDENT2 s1 = new STUDENT2 (); // Default constructor
        STUDENT2 s2 = new STUDENT2 ("Isha","DSE", 22);
        System.out.println("Default Constructor:");
        s1.display();

        System.out.println("\nParameterized Constructor:");
        s2.display();
    }
}