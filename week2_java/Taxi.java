import java.util.Scanner;
public class Taxi
{public static void main (String[] args)
 { Scanner sc= new Scanner(System.in);
	System.out.println("Enter distance");
        int dist=sc.nextInt();
        int fare=0;
if (dist>0)
{fare+=Math.min(dist,5)*10;
 {if(dist>5)
 	{fare+=Math.min(dist-5,15)*8;
          {if(dist>20)
               {fare+=Math.min(dist-20,25)*5;}}}
 
         System.out.println("Total Fare :"+fare);}}}}