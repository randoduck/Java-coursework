//
import java.util.Scanner;

class Pgm_2
{
   public static void main(String[] args)
   {
	int a, b;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first number: ");
	a = sc.nextInt();
	System.out.print("Enter second number: ");
	b = sc.nextInt();
	int carry = a, sum = b, p_sum = b;
	while (	carry != 0)
	{
	   sum = p_sum ^ carry;
	   carry = (p_sum & carry) <<1;
	   p_sum = sum;
	}
	System.out.printf("The sum of %d and %d is %d", a, b, sum);
   }
}
