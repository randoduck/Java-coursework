import java.util.Scanner;
class employeetext {
	int Eid;
	String epname;
        double basic;double DA;double IT;double Gross_Sal;double Net_Sale;

	public void read(Scanner sc)
	{System.out.println("Enter Emplyee id: ");
		Eid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name: ");
		epname=sc.nextLine();
		System.out.println("Enter Basic Salary: ");
		basic=sc.nextDouble();
	}
	public void compute_basic_net()
	{DA=0.52*basic;
		Gross_Sal=basic+DA;
		IT=0.3*Gross_Sal;
		Net_Sale=Gross_Sal-IT;}
	public void display()
	{       System.out.println("-----------EMPLOYEE DETAILS-----------");
		System.out.println("Employee ID: "+Eid);
		System.out.println("Employee Name: "+epname);
		System.out.println("Basic Salary: "+basic);
		System.out.println("DA: "+DA);
		System.out.println("Gross Salary: "+Gross_Sal);
		System.out.println("Net Salart: "+Net_Sale);
		System.out.println();}}
		
public class EMPLOYEE
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int n=sc.nextInt();
		employeetext[] emp=new employeetext[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter details  "+(i+1)+": ");
			emp[i]=new employeetext(); //allocates for individual array objects
			emp[i].read(sc);
			emp[i].compute_basic_net();}
		System.out.println("\n Employee Deatils: ");
		for(employeetext r:emp)
		{r.display();}
		for(int i=0;i<n;i++)
		{emp[i].display();}}}
