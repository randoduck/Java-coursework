import java.util.Scanner;
public class STUDENT {
	String sname;
	int marks_array[]=new int[3];
	int total;
        String name;
        String sub;
        int rollNo;

	double average;
	public void assign()
	{       Scanner sc = new Scanner(System.in);
                System.out.println("Enter Student name: ");
		sname=sc.next();
                System.out.println("Enter mrks in three subjects :");
		marks_array[0]=87;
                marks_array[1]=93;
                marks_array[2]=76;
		total=0;
		average=0.0;
	}
	void display()
	{	System.out.println("Student Name: "+sname);
                System.out.println("Student Name: "+sname);
                System.out.println("----------Score Card---------");
		for(int i=0;i<3;i++)
		{System.out.println("Subject "+(i+1)+": "+marks_array[i]);}}

	void compute()
	{
		for(int i=0;i<3;i++)
		{total+=marks_array[i];}
		average=total/3.0;
		System.out.println("Average: "+average);
	}
          
        STUDENT() 
        {   name = "Batman";
            sub = "none";
            rollNo = 0;}

       // Parameterized Constructor
        STUDENT(String name, String sub, int rollNo) 
        {  this.name = name;
           this.sub = sub;
           this.rollNo = rollNo;}

        void display2() 
      { System.out.println("Name: " + name);
        System.out.println("Subject: " + sub);
        System.out.println("Roll Number: " + rollNo);}

	public static void main(String[] args) {
		STUDENT s=new STUDENT();
		s.assign();
		s.display();
		s.compute();
       	        STUDENT s1 = new STUDENT (); // Default constructor
        	STUDENT s2 = new STUDENT ("Isha","DSE", 22);
                System.out.println("Default Constructor:");
                s1.display2();
                System.out.println("\nParameterized Constructor:");
                s2.display2();
    }
}





//chatpt, gemini, claude, perplexity, alexa, siri, copilot, deepseek