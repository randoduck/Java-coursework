import java.util.Scanner;
public class employee {
	String name;
	int id;
	int salary;
	int n;
	class department
	{
		String dpname;
		String location;
		department()
		{
			dpname="";
			location="";
		}
		void assign(String dpname,String location)
		{
			this.dpname=dpname;
			this.location=location;
		}
		void display()
		{
			System.out.println("Department Name: "+dpname);
			System.out.println("Loaction: "+location);
			
		}
	}
	
	void addDep(int n,Scanner sc,department[] dp)
	{
		String dpname;
		String location;
		for(int i=0;i<n;i++)
		{
			dp[i]=new department();
			System.out.println("Enter Departmanet "+(i+1)+": ");
			dpname=sc.next();
			sc.nextLine();
			System.out.println("Enter Location: ");
			location=sc.nextLine();
			dp[i].assign(dpname,location);
		}
	}
	int input(Scanner sc)
	{
		System.out.println("Enter Name of the Employee: ");
		name=sc.nextLine();
		System.out.println("Enter Employee ID: ");
		id=sc.nextInt();
		System.out.println("Enter Salary: ");
		salary=sc.nextInt();
		System.out.println("Enter total number of Departments: ");
		n=sc.nextInt();
		return n;
	}
	void output(department[] dp,int n)
	{
		System.out.println("Employee Name: "+name);
		System.out.println("Employee ID: "+id);
		System.out.println("Salary: "+salary);
		System.out.println();
		for(int i=0;i<n;i++)
		{
			dp[i].display();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		employee e=new employee();
		Scanner sc=new Scanner(System.in);
		int n=e.input(sc);
		department[] dp=new department[n];
		e.addDep(n, sc, dp);
		e.output(dp,n);
				

	}

}