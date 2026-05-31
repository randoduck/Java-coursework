import java.util.Scanner;
public class year
{public static void main (String[] args)
 { Scanner sc= new Scanner(System.in);
	System.out.println("Enter registration number: ");
        int reg=sc.nextInt();
        int year=0;
        if((reg/10000000)>25)
         year=1900+(reg/10000000);
        else
        year=2000+(reg/10000000);
        System.out.println("Your year of joining is : "+year);}}

