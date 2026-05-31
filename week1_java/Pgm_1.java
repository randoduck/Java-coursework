import java.util.Scanner;
class Pgm_1
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter number of hours worked by employee: ");
	  int hours = sc.nextInt();
	  System.out.print("Enter hourly rate: ");
	  double rate = sc.nextDouble();
	  double salary;
	  if (hours <= 40)
	     salary = hours*rate;
	  else
	     salary = 40*rate + (hours-40)*(rate*1.5);
	  System.out.println("Salary of employee: " + salary);    
	}
}