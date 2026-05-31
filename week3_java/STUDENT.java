import java.util.Scanner;
public class STUDENT {
	String sname;String name;
	int marks,rollno;
	int marks_array[]=new int[3];
	int total;
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
	{       name="Unkown";
	        marks=0;
		rollno=0;}


	STUDENT(String name,int age,int rollno)
	{this.name=name;
         this.marks=marks;
	 this.rollno=rollno;}
        void display2()
	{System.out.println("Student Name: "+name);
	 System.out.println("Marks: "+marks);
	 System.out.println("Roll Number: "+rollno);}
	
public static void main(String[] args) {
		STUDENT s1=new STUDENT();
		STUDENT s2=new STUDENT("Isha",100,78);
		System.out.println("Default");
                s1.assign();
                s1.compute();
		s1.display();
                s1.display2();
		System.out.println();
		System.out.println("Parametrized");
		s2.display();}}

}




